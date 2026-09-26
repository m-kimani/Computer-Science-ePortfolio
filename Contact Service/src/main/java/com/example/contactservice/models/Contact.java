package com.example.contactservice.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Entity
@Table(name="contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="First name required.")
    @Size(max=50, message = "First name cannot exceed 50 characters.")
    @Column(nullable = false, length = 50)
    private String firstName;

    @NotBlank(message="Last name required.")
    @Size(max=50, message = "Last name cannot exceed 50 characters.")
    @Column(nullable = false, length = 50)
    private String lastName;

    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$",
            message = "Phone number must be valid ")
    @Column(length = 20)
    private String phone;

    @NotBlank(message="Address is required.")
    @Size(min = 10, max=255, message = "Address must be between 10 and 255 characters.")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-zA-Z]).{5,},\\s*.*\\b\\d{5}(-\\d{4})?\\b.*$",
            message = "Address must include a street number, street text, and a 5 digit ZIP code.")
    @Column(nullable = false, length = 255)
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
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
            this.lastName = lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
            this.address = address;
    }

}

