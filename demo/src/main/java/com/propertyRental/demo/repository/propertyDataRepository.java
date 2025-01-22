package com.propertyRental.demo.repository;


import com.propertyRental.demo.entity.propertyDataEntry;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface propertyDataRepository extends MongoRepository<propertyDataEntry, String> {
}