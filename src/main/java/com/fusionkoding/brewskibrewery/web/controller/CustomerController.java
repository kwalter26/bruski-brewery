package com.fusionkoding.brewskibrewery.web.controller;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.service.CustomerService;
import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
