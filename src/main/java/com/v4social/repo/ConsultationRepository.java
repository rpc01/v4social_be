package com.v4social.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.v4social.domain.Consultation;

public interface ConsultationRepository extends PagingAndSortingRepository<Consultation,Integer> {
    /**
     * Lookup a Page of Tours associated with a TourPackage
     *
     * @param code the tour Package code.
     * @param pageable details for finding the correct page.
     * @return A page of tours if found, empty otherwise.
     */
    Page<Consultation> findByTourPackageCode(@Param("code") String code, Pageable pageable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends Consultation> S save(S s);

    //Not exposed by Spring Data REST
    @RestResource(exported = false)
    <S extends Consultation> Iterable<S> save(Iterable<S> iterable);

    //Not exposed by Spring Data REST
    @RestResource(exported = false)
    void delete(Integer integer);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(Consultation consultation);

    //Not exposed by Spring Data REST
    @RestResource(exported = false)
    void delete(Iterable<? extends Consultation> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll();
}
