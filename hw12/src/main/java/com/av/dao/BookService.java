package com.av.dao;

import com.av.domain.Book;

import java.util.Optional;

public interface BookService extends GenericDomainCrud<Long, Book>  {
    void deleteAll();
    void deleteById(Long bookId);

    Optional<Book> getById(Long bookId);
}
