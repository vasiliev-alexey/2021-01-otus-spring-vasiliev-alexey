package com.av.services.impl;

import com.av.dao.GenreRepository;
import com.av.dao.GenreService;
import com.av.domain.Genre;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("genreService")
public class GenreServiceImpl implements GenreService {


    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void delete(Genre genre) {
     genreRepository.delete(genre);
    }

    @Override
    public List<Genre> findAll() {
        return Lists.newArrayList(genreRepository.findAll());
    }

    @Override
    public Genre findByName(String genreName) {
        return genreRepository.findByName(genreName);
    }
}
