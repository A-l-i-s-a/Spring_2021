package edu.spring.data.repository;

import edu.spring.data.domain.Person;
import org.springframework.data.jpa.domain.Specification;

public class PersonSpetificayion {
    public static Specification<Person> nameLike(String name) {
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), name + "%"));
    }
}
