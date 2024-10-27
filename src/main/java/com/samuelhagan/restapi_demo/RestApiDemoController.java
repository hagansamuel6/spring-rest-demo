package com.samuelhagan.restapi_demo;


import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RestApiDemoController {

    // private List<Coffee> coffees = new ArrayList<>();
    private final CoffeeRepository coffeeRepository;

    public RestApiDemoController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
  

        // coffees.addAll(List.of(
        //     new Coffee("Cafe Cereza"),
        //     new Coffee("Cafe Ganador"),
        //     new Coffee("Cafe Lareno"),
        //     new Coffee("Cafe Tres Pontas")
        // ));
    }

   // @RequestMapping(value = "/coffees", method=RequestMethod.GET)
   @GetMapping("/coffees")
    Iterable<Coffee> getCoffees() {
        return coffeeRepository.findAll();
    }

    @GetMapping("/coffees/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id){
       return coffeeRepository.findById(id);
    }

    @PostMapping("/coffees")
    Coffee postCoffee(@RequestBody Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    @PutMapping("/coffees/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String Id, @RequestBody Coffee coffee){
       

        return (coffeeRepository.existsById(Id)) ? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK)  : new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED) ;
    }

    @DeleteMapping("/coffees/{id}")
    void deleteCoffee(@PathVariable String id){
        coffeeRepository.deleteById(id);
    }
    

}
