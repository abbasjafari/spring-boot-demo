package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlr {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
    // post put delete

}
