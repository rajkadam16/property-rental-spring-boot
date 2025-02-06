package com.propertyRental.demo.entity;


import lombok.Data;

import java.util.List;

@Data
public class CommunityAmenities {
    private String title;
    private List<String> features;
}