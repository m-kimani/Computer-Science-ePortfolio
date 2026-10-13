package com.example.contactservice.services;

import java.util.List;
import java.util.Optional;

import com.example.contactservice.models.Contact;
import com.example.contactservice.repositories.ContactRepo;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepo contactRepo;

    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    // Add a new contact
    public Contact addContact(Contact contact) {
        return contactRepo.save(contact);
    }

    // Delete a contact by id
    public void deleteContact(Long id) {
        contactRepo.deleteById(id);
    }

    // Updates an existing contact
    public Optional<Contact> updateContact(Long id, Contact updatedContact) {
        Optional<Contact> oldContact = contactRepo.findById(id);
        oldContact.ifPresent(contact -> {
            contact.setFirstName(updatedContact.getFirstName());
            contact.setLastName(updatedContact.getLastName());
            contact.setPhone(updatedContact.getPhone());
            contact.setAddress(updatedContact.getAddress());
            contactRepo.save(contact);
        });

        return oldContact;


    }

    // Retrieve a list off all contacts
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }

    // Retrieve a contact by id
    public Optional<Contact> getContactById(Long id) {
        return contactRepo.findById(id);
    }
}


