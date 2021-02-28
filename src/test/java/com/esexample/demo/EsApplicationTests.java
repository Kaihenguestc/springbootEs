package com.esexample.demo;

import com.esexample.demo.entity.Person;
import com.esexample.demo.repository.PersonRepository;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {
		Person person = new Person();
		person.setName("ceshi");
		person.setAge(1);
		person.setId("11");
		personRepository.index(person);
	}

}
