package com.propertyRental.demo.controller;

import com.propertyRental.demo.entity.LoginRequest;
import com.propertyRental.demo.entity.User;
import com.propertyRental.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private  UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<?> signup( @RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Optional<User> user = userService.findByEmail(request.getEmail());
        return ResponseEntity.badRequest().body("Invalid email or password");
    }
}
