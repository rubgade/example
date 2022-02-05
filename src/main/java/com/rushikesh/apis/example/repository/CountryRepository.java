
package com.rushikesh.apis.example.repository;


import com.rushikesh.apis.example.entity.Country;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
