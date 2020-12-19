package com.hjb.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello world!";
    }
}
