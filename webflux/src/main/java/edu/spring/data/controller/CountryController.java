package edu.spring.data.controller;

import edu.spring.data.domain.Country;
import edu.spring.data.repository.CountryRepo;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CountryController {
    private final CountryRepo countryRepo;

    public CountryController(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    @GetMapping("/allcountry")
    public Flux<Country> allCountry() {
        return countryRepo.findAll();
    }

    @GetMapping("/country/bycount/{count}")
    public Flux<Country> findAllByCount(@PathVariable("count") int count) {
        return countryRepo.findAllByCount(count);
    }

    @GetMapping("/country/bycountislessthan/{count}")
    public Flux<Country> findAllByCountIsLessThan(@PathVariable("count") int count) {
        return countryRepo.findAllByCountIsLessThan(count);
    }

    @PostMapping("/country")
    public Mono<Country> saveCountry(@RequestBody Mono<Country> dto) {
        return countryRepo.save(dto);
    }
}
