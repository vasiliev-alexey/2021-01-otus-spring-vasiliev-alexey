package com.av.dao;

import com.av.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends  JpaRepository<Genre, Long> {
    Genre findByName(String genreName);
}
