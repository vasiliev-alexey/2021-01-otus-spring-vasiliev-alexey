package com.av.dao;

import com.av.domain.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<Genre, Long> {
    Genre findByName(String genreName);
}
