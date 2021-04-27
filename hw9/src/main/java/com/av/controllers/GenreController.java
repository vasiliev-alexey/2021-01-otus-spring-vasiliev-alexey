package com.av.controllers;

import com.av.dao.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("genres")
    public String getAllGenres(Model model) {

        model.addAttribute("genres",   genreService.findAll());
        return "genres";

    }

}
