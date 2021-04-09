package com.av.services.impl;

import com.av.dao.AuthorRepository;
import com.av.dao.AuthorService;
import com.av.domain.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findByName(String authorName) {
        logger.info(String.format("find author by name%s", authorName));
        return authorRepository.findByName(authorName);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public List<Author> findAll() {
        logger.info("find all author by name%s");
        return newArrayList(authorRepository.findAll());
    }
}
