package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class AboutUs {
    private String title;
    private String description;
    private List<String> details;
}