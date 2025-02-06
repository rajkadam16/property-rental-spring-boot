package com.propertyRental.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Hospital {
    private String title;
    private List<HospitalDetail> details;
}