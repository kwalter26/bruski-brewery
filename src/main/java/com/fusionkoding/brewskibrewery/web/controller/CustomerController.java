package com.fusionkoding.brewskibrewery.web.controller;

import java.net.URI;
import java.util.UUID;

import com.fusionkoding.brewskibrewery.service.CustomerService;
import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID customerId) {
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @PostMapping
    public ResponseEntity<CustomerDto> handleCreate(@RequestBody CustomerDto beerDto) {
        CustomerDto savedBeer = customerService.createCustomer(beerDto);
        return ResponseEntity.created(URI.create("/api/v1/customer/" + savedBeer.getId())).body(savedBeer);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<CustomerDto> handleUpdate(@PathVariable UUID beerId, CustomerDto beerDto) {
        customerService.updateCustomer(beerId, beerDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        customerService.deleteById(beerId);
    }

}
