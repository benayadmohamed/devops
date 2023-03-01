package com.example.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Helloword {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
