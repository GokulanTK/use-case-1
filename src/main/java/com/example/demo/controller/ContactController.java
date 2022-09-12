package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Contact;
import com.example.demo.model.RequestBody.SaveContact;
import com.example.demo.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

  @Autowired
  private ContactService contactService;

  @GetMapping("/contact")
  public ResponseEntity<List<Contact>> getAllContacts(){
    return new ResponseEntity<>(this.contactService.getAllContacts(), HttpStatus.OK);
  }

  @GetMapping("/contact/retrieve/{id}")
  public ResponseEntity<Optional<Contact>> retrieveContact(@PathVariable int id){
    return new ResponseEntity<>(this.contactService.retrieveContact(id), HttpStatus.OK);
  }

  @PutMapping("/contact/{id}")
  public ResponseEntity<Contact> updateContact(@RequestBody Contact contact ,@PathVariable("id")int id){
    return new ResponseEntity<>(this.contactService.updateContact(contact,id),HttpStatus.CREATED);
  }

  @PostMapping("/contact/save")
  public ResponseEntity<Contact> saveContact(@RequestBody SaveContact saveContact){
    return new ResponseEntity<>(this.contactService.saveContact(saveContact.getName(), saveContact.getNumber()), HttpStatus.CREATED);
  }

}
