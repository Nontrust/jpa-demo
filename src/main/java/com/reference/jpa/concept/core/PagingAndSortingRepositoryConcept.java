package com.reference.jpa.concept.core;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PagingAndSortingRepositoryConcept<T, ID_T>
        extends org.springframework.data.repository.PagingAndSortingRepository<T, ID_T> {
    @Override Iterable<T> findAll(Sort sort);
    @Override Page<T> findAll(Pageable pageable);

}
