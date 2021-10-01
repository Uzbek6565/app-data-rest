package com.example.appdatarest.repository;

import com.example.appdatarest.entity.Address;
import com.example.appdatarest.projection.CustomAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "address", collectionResourceRel = "list", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {

    //This is for searching not for sorting http://localhost:8080/api/address?sort=city,street,desc
    @RestResource(path = "byName")
    public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable); //http://localhost:8080/api/address/search/byName?city=Qarshi

}
