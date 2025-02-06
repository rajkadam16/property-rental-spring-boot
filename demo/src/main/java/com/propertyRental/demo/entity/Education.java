package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Education {
    private String title;
    private List<School> details;
}