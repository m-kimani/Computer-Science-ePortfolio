package com.example.contactservice.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.contactservice.models.Contact;
import com.example.contactservice.repositories.ContactRepo;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final List<Contact> contactList = new ArrayList<>();
    private final ContactRepo contactRepo;

    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    // Add a new contact
    public Contact addContact(Contact contact) {
        return contactRepo.save(contact);
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

    public Optional<Contact> getContactById(Long id) {
        return contactRepo.findById(id);
    }
}


