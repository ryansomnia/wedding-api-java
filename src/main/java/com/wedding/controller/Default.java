package com.wedding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Default {

    @GetMapping
    public String wellcome() {
        return "API";
    }

    // @PostMapping
    // public String other() {
    // return "Data lain";
    // }

}
