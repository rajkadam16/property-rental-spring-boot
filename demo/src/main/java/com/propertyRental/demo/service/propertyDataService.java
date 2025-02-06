package com.propertyRental.demo.service;

import com.propertyRental.demo.entity.propertyDataEntry;
import com.propertyRental.demo.repository.propertyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class propertyDataService {

    @Autowired
    private propertyDataRepository propertyRepository;

    public List<propertyDataEntry> getAllProperties() {
        return propertyRepository.findAll();
    }

    public propertyDataEntry getPropertyById(String id) {
        return propertyRepository.findById(id).orElse(null);
    }
    public propertyDataEntry saveProperty(propertyDataEntry propertyDataEntry) {
        return propertyRepository.save(propertyDataEntry);
    }


    public propertyDataEntry updateProperty(String id, propertyDataEntry property) {
        property.setId(id);
        return propertyRepository.save(property);
    }

    public void deleteProperty(String id) {
        propertyRepository.deleteById(id);
    }

}
