package com.av.dao;

import com.av.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {

    Author findByName(String authorName);

}
