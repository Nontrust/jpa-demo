package com.reference.jpa.demo;

import com.reference.jpa.demo.entity.Person;
import com.reference.jpa.demo.entity.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.NoSuchElementException;

@SpringBootApplication
@Slf4j
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PersonRepository repository){
        return args -> {
            Person person = new Person();
            person.setName("Nontrust");

            repository.save(person);
            Person persistPerson = repository.findById(person.getId())
                    .orElseThrow(NoSuchElementException::new);
            log.error("persistPerson {}", persistPerson.getId());
        };
    }
}
