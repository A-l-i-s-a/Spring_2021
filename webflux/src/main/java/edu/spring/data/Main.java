package edu.spring.data;

import edu.spring.data.domain.Country;
import edu.spring.data.domain.Person;
import edu.spring.data.repository.CountryRepo;
import edu.spring.data.repository.PersonRepository;
import edu.spring.data.repository.PersonSpetificayion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import javax.annotation.PostConstruct;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@SpringBootApplication
public class Main {

    @Autowired
    private PersonRepository repository;
    @Autowired
    private CountryRepo countryRepo;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @PostConstruct
    public void init() {
        repository.save(new Person("Pusekin"));
        repository.save(new Person("Pusek0n"));
        repository.save(new Person("Puseein"));
        repository.save(new Person("Pusefin"));
        repository.save(new Person("Pusekin"));
        repository.save(new Person("Pusfkin"));
        repository.save(new Person("Pusykin"));
        repository.save(new Person("Pusikin"));
        repository.save(new Person("Pushkin"));
        repository.save(new Person("Pushkin"));
        repository.save(new Person("Pushfin"));
        repository.save(new Person("Pushkon"));
        repository.save(new Person("A"));
        repository.save(new Person("b"));
        repository.save(new Person("f"));
        repository.save(new Person("g"));
        repository.save(new Person("o"));
        repository.save(new Person("C"));
        repository.save(new Person("C"));
        repository.save(new Person("C"));
        repository.save(new Person("C"));
        repository.save(new Person("C"));
        repository.save(new Person("r"));
        repository.save(new Person("u"));
        repository.save(new Person("H"));
        repository.save(new Person("H"));
        repository.save(new Person("H"));
        repository.save(new Person("H"));
        repository.save(new Person("H"));
        countryRepo.save(new Country("1name", 10));
        countryRepo.save(new Country("n2ame", 100));
        countryRepo.save(new Country("na3me", 1000));
        countryRepo.save(new Country("nam4e", 10000));
        countryRepo.save(new Country("name5", 100000));
        countryRepo.save(new Country("n6ame", 1000000));
        countryRepo.save(new Country("na7me", 10000000));
        countryRepo.save(new Country("nam8e", 100000000));
        countryRepo.save(new Country("name9", 10));

        System.out.println(repository.findByName("A") + "\n===================================");
        repository.findAllByName("Pushkin").forEach(System.out::println);
        System.out.println(repository.countByName("Pushkin"));
        repository.findAll(PageRequest.of(4, 2)).forEach(System.out::println);
        System.out.println("=========================================");
        repository.findAllByNameLike("Pus%").forEach(System.out::println);

        System.out.println("=========================================");
        countryRepo.findAllByCount(10).forEach(System.out::println);

        System.out.println("=========================================");
        countryRepo.findAllByCountIsLessThan(1000000).forEach(System.out::println);

        System.out.println("=========================================");
        repository.findAll(PersonSpetificayion.nameLike("Push")).forEach(System.out::println);
    }
}
