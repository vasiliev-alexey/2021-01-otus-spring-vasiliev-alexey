package com.av.dao.impl;

import com.av.dao.AuthorRepository;
import com.av.domain.Author;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

@ChangeLog(order = "002")
public class DatabaseChangelogSeeder {

    @ChangeSet(order = "002", id = "change2", author = "vasiliev-alexey" , runAlways = true)
    public  void migrateAuthor(AuthorRepository authorRepository) {

        authorRepository.deleteAll();
        authorRepository.save(new Author("Jon Daw"));
        authorRepository.save(new Author("Егор Бугаенко"));
        authorRepository.save(new Author("Test for Delete"));


    }

}
