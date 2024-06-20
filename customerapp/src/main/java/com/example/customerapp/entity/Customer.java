package com.example.customerapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String accountType;
    private String variantOfAccount;
    private int age;
    private boolean pwd; // Person with Disability
    private String currentAddress;
    private String communicationAddress;
    private String email;
    private String phoneNumber;
    private String panNumber;
    private String aadharNumber;
    private boolean debitCard;
    private boolean inbActivation;

    // Constructors, getters, and setters
}
