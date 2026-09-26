package com.example.contactservice.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.contactservice.models.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final List<Contact> contactList = new ArrayList<>();

    public Contact addContact(Contact contact) {

        // Update to connect to PostgreSQL database to add a new contact
        return contact;
    }

    public void deleteContact(Long id) {
        // Update to connect to PostgreSQL database to delete a contact by id
    }

    // Condensed all update methods to one overall update method
    public Contact updateContact(Long id, Contact updatedContact) {
        // Update to connect to PostgreSQL database to update retrieved contact
        return updatedContact;
    }

    public List<Contact> getAllContacts() {
        // Update to connect to PostgreSQL database to retrieve a list off all contacts
        return new ArrayList<>();
    }

    public Contact getContactById(Long id) {
        // Update to connect to PostgreSQL database to retrieve a list off all contacts
        return new Contact();
    }
}


