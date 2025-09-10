package br.com.fredericoaraujo.sqlite.controller;

import br.com.fredericoaraujo.sqlite.model.entity.Person;
import br.com.fredericoaraujo.sqlite.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/hello")
    public String index() {
//        personRepository.save(new Person(null, "Frederico Araujo"));
        Person fredericoAraujo = personRepository.getReferenceById(1L);
        return fredericoAraujo.getName();
    }
}
