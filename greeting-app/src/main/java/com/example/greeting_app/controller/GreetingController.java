package com.example.greeting_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "👋 Hello, welcome to the Greeting App!";
    }
}