package com.av.controllers;

import com.av.dao.AuthorService;
import com.av.domain.Author;
import com.av.dto.AuthorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorApiController {


    private final AuthorService authorService;

    public AuthorApiController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/api/author")
    public ResponseEntity<?> getAllGenres(Model model) {
        List<Author> authors = authorService.findAll();
        List<AuthorDto> dtoList  = new ArrayList<>();
        authors.forEach(a -> dtoList.add(new AuthorDto(a.getId(), a.getName())));
        return new ResponseEntity<>(dtoList , HttpStatus.OK);
    }
}
