package com.samuelhagan.restapi_demo;

import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
