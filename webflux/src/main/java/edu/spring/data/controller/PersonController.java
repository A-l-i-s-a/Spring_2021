package edu.spring.data.controller;

import edu.spring.data.domain.Person;
import edu.spring.data.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/allperson")
    public Flux<Person> allPerson() {
        return repository.findAll();
    }

    @GetMapping("/person/{id}")
    public Mono<Person> byId(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @GetMapping("/person/byname")
    public Flux<Person> findByName(@RequestParam("name") String name) {
        return repository.findAllByName(name);
    }

    @GetMapping("/person/byage")
    public Flux<Person> findAllByName(@RequestParam("name") String name) {
        return repository.findAllByNameLike(name);
    }

    @GetMapping("/person")
    public Mono<Person> savePerson(@RequestBody Mono<Person> dto) {
        return repository.save(dto);
    }
}
