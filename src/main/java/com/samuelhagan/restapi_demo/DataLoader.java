package com.samuelhagan.restapi_demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    private static final Logger log = LoggerFactory.getLogger(RestapiDemoApplication.class);
    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData(){
        coffeeRepository.saveAll(List.of(
            new Coffee("Cafe Cereza"),
            new Coffee("Cafe Ganador"),
            new Coffee("Cafe Lareno"),
            new Coffee("Cafe Tres Pontas")
        ));

        log.info("data loadedccesfully");
    }
}
