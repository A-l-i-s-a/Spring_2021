package edu.spring.data.repository;

import edu.spring.data.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepo extends JpaRepository<Country, Integer> {
    List<Country> findAllByCount(int count);

    List<Country> findAllByCountIsLessThan(int count);

}
