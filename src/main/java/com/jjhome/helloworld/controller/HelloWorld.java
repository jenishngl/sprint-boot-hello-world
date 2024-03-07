package com.jjhome.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {
    
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }   
}