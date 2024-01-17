package com.reference.jpa.concept.core.repo;

import com.reference.jpa.concept.core.Concept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConceptRepository
        extends CrudRepository<Concept, Long>, PagingAndSortingRepository<Concept, Long> {
}
