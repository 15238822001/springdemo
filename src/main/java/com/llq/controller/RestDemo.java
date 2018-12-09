package com.llq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {
    @RequestMapping("/hello1")
    public String hello1() {
        return "Hello World";
    }
}
