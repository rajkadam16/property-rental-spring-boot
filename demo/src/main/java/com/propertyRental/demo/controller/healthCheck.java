package com.propertyRental.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
    @GetMapping("/helthCheck")
    public String health(){
        return "i am run";
    }

}
