package com.example.RESOURCESVC.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @PostMapping("/test")
    public String test() {
        return "Hello World";
    }
}
