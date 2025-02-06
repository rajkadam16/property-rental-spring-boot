package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class ImageGallery {
    private String id;
    private String type;
    private List<Image> images;
}