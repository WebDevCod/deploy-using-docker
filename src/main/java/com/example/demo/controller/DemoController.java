package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String hello() {
        return "Hello from Render";
    }
}
