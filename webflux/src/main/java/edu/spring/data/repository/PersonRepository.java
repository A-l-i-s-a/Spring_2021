package edu.spring.data.repository;

import edu.spring.data.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person> {

    Person findByName(String name);

    List<Person> findAllByName(String name);

    int countByName(String name);

    List<Person> findAllByNameLike(String str);



}
