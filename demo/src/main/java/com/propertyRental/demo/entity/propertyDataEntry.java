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
    private PropertyImgGallery propertyImgGallery;
    private PropertyPhotos propertyPhotos;
    private PropertyFloorPlans propertyFloorPlans;
    private String locationhierarchy;
    private String propertyName;
    private String propertyLocation;
    private int propertyPrice;
    private String propertyOverViewImage;
    private String propertyCardImage;
    private String propertyArea;
    private String bhk;
    private String typeOfProperty;
    private String furnishing;
    private String parking;
    private String propertySize;
    private double propertyMapPositionInLat;
    private double propertyMapPositionInLong;
    private List<String> propertyAmenities;
    private FloorplanDetails floorplandetails;
    private PropertyUnitsData propertyunitsdata;
    private AboutProperty aboutProperty;
    private UniqueFeaturesOfProperty uniqueFeaturesOfProperty;
    private NeighborhoodData neighborhoodData;
    private PropertyAmenitie propertyAmenitie;
    private ApartmentFeature apartmentFeature;
    private PropertySchoolData propertySchoolData;
    private ContactPropertyBox contactpropertybox;

    @Data
    public static class PropertyImgGallery {
        private String id;
        private List<Image> images;
    }

    @Data
    public static class PropertyPhotos {
        private String id;
        private List<Image> images;
    }

    @Data
    public static class PropertyFloorPlans {
        private String id;
        private List<Image> images;
    }

    @Data
    public static class Image {
        private String url;
        private String alt;
    }

    @Data
    public static class FloorplanDetails {
        private String heading;
        private List<Feature> features;
    }

    @Data
    public static class PropertyUnitsData {
        private List<PropertyUnitCol> propertyunitscol;
        private List<UnitData> unitsdata;
    }

    @Data
    public static class AboutProperty {
        private String heading;
        private String description;
        private String details;
    }

    @Data
    public static class UniqueFeaturesOfProperty {
        private String heading;
        private List<Feature> features;
    }

    @Data
    public static class NeighborhoodData {
        private String heading;
        private String description;
        private List<String> details;
    }

    @Data
    public static class PropertyAmenitie {
        private String heading;
        private List<Feature> features;
    }

    @Data
    public static class ApartmentFeature {
        private String heading;
        private List<Feature> features;
    }

    @Data
    public static class PropertySchoolData {
        private String heading;
        private List<SchoolData> schoolData;
    }

    @Data
    public static class ContactPropertyBox {
        private boolean isEnabled;
        private String heading;
        private String btn1;
        private String btn2;
        private String phone;
    }

    @Data
    public static class Feature {
        private String value;
    }

    @Data
    public static class PropertyUnitCol {
        private String value;
    }

    @Data
    public static class UnitData {
        private String unit;
        private String price;
        private String squarefit;
        private String availability;
        private List<Feature> features;
        private List<Feature> kitchenFeatures;
    }

    @Data
    public static class SchoolData {
        private String schoolName;
        private String schoolAddress;
        private String schoolDistance;
        private String schoolType;
        private String schoolRating;
    }

}