package com.lyl.onlineshop.controller;

@RestController
public class FirstPage {
    @RequestMapping("/hello")
    public String firstPage() {
        return "Hello World";
    }
}
