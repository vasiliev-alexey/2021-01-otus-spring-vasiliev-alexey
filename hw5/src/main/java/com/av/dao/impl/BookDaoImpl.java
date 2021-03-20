package com.av.dao.impl;

import com.av.dao.AuthorDao;
import com.av.dao.BookDao;
import com.av.dao.GenreDao;
import com.av.domain.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao<Long, Book> {

    private final GenreDao genreDao;
    private final AuthorDao authorDao;

    public BookDaoImpl(GenreDao genreDao, AuthorDao authorDao) {
        this.genreDao = genreDao;
        this.authorDao = authorDao;
    }

    @Override
    public Book add(Book domain) {
        return null;
    }

    @Override
    public Book update(Book domain) {
        return null;
    }

    @Override
    public void delete(Book domain) {
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }

    private static class BookResultSetExtractor implements ResultSetExtractor<Book> {

        @Override
        public Book extractData(ResultSet rs) throws SQLException, DataAccessException {
            return null;
        }
    }
}
