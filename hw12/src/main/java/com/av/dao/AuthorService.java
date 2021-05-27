package com.av.dao;

import com.av.domain.Author;

public interface AuthorService extends GenericDomainCrud<Long, Author> {
    Author findByName(String authorName);
}
