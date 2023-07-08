package com.wedding.controller;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wellcome")
public class WellcomeController {

    @GetMapping
    public String wellcome() {
        return "Wellcome to RestAPI wedding";
    }

    // @PostMapping
    // public String other() {
    // return "Data lain";
    // }

}
