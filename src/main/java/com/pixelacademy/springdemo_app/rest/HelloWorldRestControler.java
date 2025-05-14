package com.pixelacademy.springdemo_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestControler {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
