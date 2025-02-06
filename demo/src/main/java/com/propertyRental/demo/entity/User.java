package com.propertyRental.demo.entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;

    private String role = "USER"; // Default role
}
