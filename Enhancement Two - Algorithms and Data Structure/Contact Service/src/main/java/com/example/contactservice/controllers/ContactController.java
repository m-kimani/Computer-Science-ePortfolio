package com.example.contactservice.controllers;

import com.example.contactservice.models.Contact;
import com.example.contactservice.services.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // GET - All Contacts
    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    // GET - By ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Contact>> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(contactService.getContactById(id));
    }


    // POST - Create contact
    @PostMapping
    public ResponseEntity<Contact> createContact( @Valid @RequestBody Contact contact) {
        Contact newContact = contactService.addContact(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(newContact);
    }

    // PUT - Update contact by ID
    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact( @PathVariable Long id, @Valid @RequestBody Contact updatedContact) {
        return ResponseEntity.ok(contactService.updateContact(id, updatedContact));
    }

    // DELETE - Delete contact by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact( @PathVariable Long id) {
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }




}
