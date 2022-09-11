package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  @Autowired
  private ContactRepository contactRepository;

  public List<Contact> getAllContacts() {
    return this.contactRepository.findAll();
  }

  public Optional<Contact> retrieveContact(int id) {
    return this.contactRepository.findById(id);
  }

  public Contact saveContact(String name, String number) {
    Contact contact = Contact.builder().name(name).number(number).build();
    return this.contactRepository.save(contact);
  }

  public Contact updateContact( Contact contact, int id) {
    return contactRepository.save(contact);
  }
  
}
