package com.esexample.demo.controller;

import com.esexample.demo.entity.Person;
import com.esexample.demo.repository.PersonRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    
    @Autowired
    PersonRepository personRepository;
    
    @GetMapping("/es/get/{id}")
    public Person getDc(@PathVariable String id) {
        return personRepository.findById(id).get();
    }

    @PostMapping("/es/put")
    public Person putDc(Person person) {
        if (person != null) {
            return personRepository.index(person);
        }
        return new Person();
    }

    @GetMapping("/persons/search")
    public List<Person> getAll() {
        return Lists.newArrayList(personRepository.findAll());
    }

    @GetMapping("/es/del/{id}")
    public String delDc(@PathVariable String id) {
        personRepository.delete(personRepository.findById(id).get());
        return "succes";
    }

    @GetMapping("/es/detail")
    public void addperson(){
        Person person = new Person();
        person.setId("9");
        person.setAge(29);
        person.setName("kaiheng");
        personRepository.index(person);

    }

}
