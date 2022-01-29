package com.example.PeEx.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeExController {
    @RequestMapping("/")
    String hello() {
        return "Hello PeEx!";
    }
}