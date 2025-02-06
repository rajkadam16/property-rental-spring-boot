package com.propertyRental.demo.controller;


import com.propertyRental.demo.entity.User;
import com.propertyRental.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for this controller
public class AuthController {

    @PostMapping("/auth/signup")
    public String signup(User user) {
        // Your signup logic here
        return "User registered successfully!";
    }

    @PostMapping("/auth/login")
    public String login(User user) {
        // Your login logic here
        return "Login successful!";
    }
}
