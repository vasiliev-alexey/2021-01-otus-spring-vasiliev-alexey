package com.av.controllers;

import com.av.dao.AuthorService;
import com.av.dao.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("author")
    public String GetAllGenres(Model model) {
        model.addAttribute( "authors",    authorService.findAll());

        return "authors";

    }

}
