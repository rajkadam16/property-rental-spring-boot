package com.propertyRental.demo.entity;


import lombok.Data;

import java.util.List;

@Data
public class OfficeHours {
    private String time;
    private String timeZone;
    private List<String> workingDays;
}