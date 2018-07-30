package com.v4social.repo;

import com.v4social.domain.Consultation;
import com.v4social.domain.Organization;
import com.v4social.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
    
    Page<User> findByUserCode(@Param("code") int code, Pageable pageable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <U extends User> U save(U u);

}
