package com.av.services.impl;

import com.av.dao.BookRepository;
import com.av.dao.BookService;
import com.av.domain.Book;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public List<Book> findAll() {
        logger.info("call find all method");
        return Lists.newArrayList(bookRepository.findAll());

    }

    @Override
    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
