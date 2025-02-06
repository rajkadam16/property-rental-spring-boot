package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Transportation {
    private String title;
    private List<TransportDetail> details;
}