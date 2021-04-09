package com.av.dao;

import com.av.domain.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author , Long> {
    Author findByName(String authorName);
}
