package com.reference.jpa.concept;

import com.reference.jpa.concept.core.Concept;
import com.reference.jpa.concept.core.repo.ConceptRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Slf4j
@SpringBootApplication
public class ConceptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConceptApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ConceptRepository Repo){
        return args -> {
            List<Concept> concepts = LongStream
                    .rangeClosed(0L, 20L)
                    .mapToObj(Concept::new)
                    .collect(Collectors.toList());

            Repo.saveAll(concepts);

            Page<Concept> findPaging = Repo.findAll(PageRequest.of(1, 10));
            log.warn("paging 1 to 10 {}",findPaging);
        };
    }
}
