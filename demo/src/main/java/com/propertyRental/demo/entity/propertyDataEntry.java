package com.propertyRental.demo.entity;
import org.springframework.data.annotation.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.util.List;


@Document(collection = "properties")
@Data
@NoArgsConstructor
public class propertyDataEntry {
    @Id
    private String id;
    private List<ImageGallery> imgGallery;
    private PropertyDetails propertyDetails;
    private AboutUs aboutUs;
    private Highlights highlights;
    private AvailableUnits availableUnits;
    private NeighborHood neighborHood;
    private CommunityAmenities communityAmenities;
    private ApartmentFeatures apartmentFeatures;
    private Education education;
    private Transportation transportation;
    private Hospital hospital;

}

