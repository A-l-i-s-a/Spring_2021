package edu.spring.data.repository;

import edu.spring.data.domain.Country;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CountryRepo extends ReactiveMongoRepository<Country, Integer> {

    Flux<Country> findAll();

    Flux<Country> findAllByCount(int count);

    Flux<Country> findAllByCountIsLessThan(int count);

    Mono<Country> save(Mono<Country> country);

}
