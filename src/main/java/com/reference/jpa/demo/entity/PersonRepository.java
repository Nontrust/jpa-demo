package com.reference.jpa.demo.entity;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface PersonRepository extends Repository<Person, Long> {
    Person save(Person person);
    Optional<Person> findById(long id);
}
