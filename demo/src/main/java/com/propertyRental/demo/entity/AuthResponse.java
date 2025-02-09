package com.propertyRental.demo.entity;


public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

    // Getter

    public String getToken() {
        return token;
    }
}