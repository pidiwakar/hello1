package com.piyush.hello1.api;

import com.piyush.hello1.model.Person;
import com.piyush.hello1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonConntroller {

    private final PersonService personService;

    @Autowired
    public PersonConntroller(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
