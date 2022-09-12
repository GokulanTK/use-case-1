package com.example.demo;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.Id;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

import antlr.collections.List;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	ContactRepository cRepo;
	
	@Test
	public void testpost(){
		Contact c = new Contact();
		c.setId("1L");
		c.setName("gokulan");
		c.setNumber("0909");
		cRepo.save(c);
		assertNotNull(cRepo.findById((int) 1L).get());
	}
	
	@Test
	public void testfindbyId(){
		assertEquals(1, );
		
	}

	

	

}
