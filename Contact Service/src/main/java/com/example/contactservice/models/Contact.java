package com.example.contactservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phone, String address) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        // Add this validation to the controller instead
        if(firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Error: Invalid first name entered." + firstName);
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        // Add this validation to the controller instead
        if(lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Error: Invalid last name entered." + lastName);
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        // Add this validation to the controller instead
        if(phone != null && phone.length() == 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Error: Invalid phone number entered." + phone);
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        // Add this validation to the controller instead
        if(address != null && address.length() <= 30) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Error: Invalid address entered." + address);
        }
    }

}

