package com.av.dao.impl;

import com.av.dao.GenreDao;
import com.av.domain.Genre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GenreDaoImpl implements GenreDao {

    private static final String FETCH_SQL = "select id, name from genre";
    private static final String DELETE_SQL = "delete from genre where id= :id";
    private static final String FETCH_BY_NAME_SQL = "select * from genre where name = :genreName";
    private static final String INSERT_SQL = "insert into genre (name) values(:name)";


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public GenreDaoImpl( EntityManager em) {

        this.em = em;
    }

    @PersistenceContext
    private final EntityManager em;


    @Override
    public Genre add(Genre genre) {
//        KeyHolder holder = new GeneratedKeyHolder();
//        SqlParameterSource parameters = new MapSqlParameterSource().addValue("name", genre.getName());
//        namedJdbcTemplate.update(INSERT_SQL, parameters, holder, new String[] { "id" });
//        genre.setId(holder.getKey().longValue());
        return genre;
    }

    @Override
    public void update(Genre genre) {}

    @Override
    public void delete(Genre genre) {
        deleteById(genre.getId());
    }

    @Override
    public List<Genre> getAll() {
        return
                em.createNamedQuery(this.FETCH_SQL, Genre.class).getResultList();
    }

    @Override
    public void deleteById(Long id) {
//        var namedParameters = new MapSqlParameterSource("id", id);
//        int status = namedJdbcTemplate.update(DELETE_SQL, namedParameters);
//        if (status != 0) {
//            logger.debug("Genre with id = " + id + " removed from storage");
//        } else {
//            logger.debug("Genre not found in storage");
//        }
    }

    @Override
    public Genre findByName(String authorName) {
//        return namedJdbcTemplate.queryForObject(
//            FETCH_BY_NAME_SQL,
//            new MapSqlParameterSource("genreName", authorName),
//            new GenreRowMapper()
//        );
        return null;
    }

    private static class GenreRowMapper implements RowMapper<Genre> {

        @Override
        public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            return new Genre(id, name);
        }
    }
}
