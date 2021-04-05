package com.av.dao;

import com.av.domain.Book;

public interface BookService extends GenericDomainCrud<Long, Book>  {
    void deleteAll();
}
