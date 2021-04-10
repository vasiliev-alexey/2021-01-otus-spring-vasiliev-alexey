package com.av.migrations;

import com.av.dao.AuthorRepository;
import com.av.dao.GenreRepository;
import com.av.domain.Author;
import com.av.domain.Genre;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ChangeLog(order = "001")
public class DatabaseChangelog {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ChangeSet(order = "001", id = "change1", author = "vasiliev-alexey")
    public void migrateAuthor(AuthorRepository authorRepository) {
        authorRepository.deleteAll();
        authorRepository.save(new Author("Jon Daw"));
        authorRepository.save(new Author("Егор Бугаенко"));
        authorRepository.findAll().forEach(a -> logger.info(String.format("Author added: %s", a.toString())));
    }

    @ChangeSet(order = "002", id = "change2", author = "vasiliev-alexey")
    public void migrateGenre(GenreRepository genreRepository) {
        genreRepository.deleteAll();
        genreRepository.save(new Genre("Java"));
        genreRepository.save(new Genre("Mongo"));
        genreRepository.save(new Genre("Spring"));
        genreRepository.save(new Genre("Postgres"));
        genreRepository.findAll().forEach(a -> logger.info(String.format("Genre added: %s", a.toString())));
    }


}
