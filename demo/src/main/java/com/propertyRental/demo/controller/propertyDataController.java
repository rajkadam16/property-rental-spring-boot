package com.propertyRental.demo.controller;
import com.propertyRental.demo.entity.propertyDataEntry;
import com.propertyRental.demo.service.propertyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class propertyDataController {

    @Autowired
    private propertyDataService propertyService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping
    public List<propertyDataEntry> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public propertyDataEntry getPropertyById(@PathVariable String id) {
        return propertyService.getPropertyById(id);
    }


    @PostMapping
    public ResponseEntity<propertyDataEntry> createProperty(@RequestBody propertyDataEntry propertyDataEntry) {
        propertyDataEntry savedProperty = propertyService.saveProperty(propertyDataEntry);
        return ResponseEntity.ok(savedProperty);
    }

    @PutMapping("/{id}")
    public propertyDataEntry updateProperty(@PathVariable String id, @RequestBody propertyDataEntry property) {
        return propertyService.updateProperty(id, property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable String id) {
        propertyService.deleteProperty(id);
    }

}