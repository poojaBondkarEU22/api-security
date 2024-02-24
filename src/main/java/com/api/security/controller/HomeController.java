package com.api.security.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping
    public String home() {
        return "Hello, World!";
    }


    @GetMapping("/user")
    public String user() {
        return "Hello, User! fuck you";
    }
}
