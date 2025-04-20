package com.achhecode.testing.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "user_details")
@Data
@NoArgsConstructor
public class UserDetails {
    @Id
    private String id; // maps to MongoDB _id, MongoDB will auto-generate if null, Best-practice unless need our own ID
    private String username;
    private String name;
    private String password;
    private LocalDate dateOfBirth;
    private String address;

    // Constructor for creating new users (without id)
    public UserDetails(String username, String name, String password, LocalDate dateOfBirth, String address) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
}
