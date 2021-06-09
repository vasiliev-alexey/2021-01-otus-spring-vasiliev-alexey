package com.av.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LandingController {

    @GetMapping("/")

    public String startPage() {
        return "main";
    }
    @PostMapping("/")
    public String startPagePost() {
        return "main";
    }


}
