package com.reference.jpa.concept.core;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface CrudRepositoryConcept<T, ID_T>
        extends org.springframework.data.repository.CrudRepository<T, ID_T> {
    /**  1. Save the Entity */
    @Override <S extends T> S save(S entity);
    /** 2. Returns Entity identified by Primary ID */
    @Override Optional<T> findById(ID_T primaryKey);
    /** 3. Return ALl Entities */
    @Override Iterable<T> findAll();
    /** 4. return number of entities */
    @Override long count();
    /** 5. Deletes the given entity */
    @Override void delete(T entity);
    /** 6.Indicates whether an entity with the given Id exists */
    @Override boolean existsById(ID_T primaryKey);


    /** ... more fun */
    @Override <S extends T> Iterable<S> saveAll(Iterable<S> entities);

}
