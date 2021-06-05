package com.av.dao;

import com.av.domain.Genre;

public interface GenreService extends GenericDomainCrud<Long, Genre> {
    Genre findByName(String genreName);
}
