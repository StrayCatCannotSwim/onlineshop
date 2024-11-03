package com.lyl.onlineshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstPage {
    @RequestMapping("/hello")
    public String firstPage() {
        return "Hello World";
    }
}
