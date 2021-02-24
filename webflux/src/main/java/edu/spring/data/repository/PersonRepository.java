package edu.spring.data.repository;

import edu.spring.data.domain.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, Integer> {

    Flux<Person> findAll();

    Mono<Person> findByName(String name);

    Flux<Person> findAllByName(String name);


    int countByName(String name);

    Flux<Person> findAllByNameLike(String str);

    Mono<Person> save(Mono<Person> person);


}
