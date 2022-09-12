package com.example.demo;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.persistence.Id;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Optional;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

import antlr.collections.List;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	ContactRepository cRepo;
	
	
	@Test
	public void TestforGet(){
		Contact MockPerson = mock(Contact.class);
		MockPerson.setId(1);
		MockPerson.setName("Gokul");
		MockPerson.setNumber("9898");

		ContactService MockService = mock(ContactService.class);
		when(MockService.retrieveContact(1)).thenReturn(Optional.of(MockPerson));

		Optional<Contact> result = MockService.retrieveContact(1);
		assertNotNull(result);

	}

	
	}

	

	

}
