package com.av.dao.impl;

import com.av.dao.AuthorDao;
import com.av.domain.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {

    private static final String ALL_COLUMNS = "a.id, a.name";
    private static final String FETCH_SQL = String.format("select a from Author a");
    private static final String FETCH_BY_NAME_SQL =
            String.format("select  %s from authors where name = :authorName", ALL_COLUMNS);
    private static final String DELETE_SQL = "delete from authors where id= :id";
    private static final String INSERT_SQL = "insert into authors (name) values(:name)";

    @Resource
    private final NamedParameterJdbcTemplate namedJdbcTemplate;

    @PersistenceContext
    private final EntityManager entityManager;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public AuthorDaoImpl(NamedParameterJdbcTemplate jdbcTemplate, EntityManager entityManager) {
        this.namedJdbcTemplate = jdbcTemplate;
        this.entityManager = entityManager;
    }

    @Override
    public Author add(Author author) {
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource parameters = new MapSqlParameterSource().addValue("name", author.getName());
        namedJdbcTemplate.update(INSERT_SQL, parameters, holder, new String[]{"id"});
        author.setId(holder.getKey().longValue());
        return author;
    }

    @Override
    public void update(Author domain) {
    }

    @Override
    public void delete(Author author) {
        deleteById(author.getId());
    }

    @Override
    public List<Author> getAll() {
        return entityManager.createQuery(FETCH_SQL, Author.class).getResultList();

    }

    @Override
    public void deleteById(Long id) {
        var namedParameters = new MapSqlParameterSource("id", id);
        int status = namedJdbcTemplate.update(DELETE_SQL, namedParameters);
        if (status != 0) {
            logger.debug("Author with id = " + id + " removed from storage");
        } else {
            logger.debug("Author not found in storage");
        }
    }

    @Override
    public Author findByName(String authorName) {
        try {
            var rez = namedJdbcTemplate.queryForObject(
                    FETCH_BY_NAME_SQL,
                    new MapSqlParameterSource("authorName", authorName),
                    new AuthorRowMapper()
            );
            return rez;
        } catch (EmptyResultDataAccessException exception) {
            logger.error("author not found", exception);
            return null;
        }
    }

    private static class AuthorRowMapper implements RowMapper<Author> {

        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            return new Author(id, name);
        }
    }
}
