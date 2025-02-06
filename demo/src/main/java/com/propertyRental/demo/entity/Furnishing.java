package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Furnishing {
    private String type;
    private List<String> highlights;
}