package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(customerId).name("Rollo Walter").build();
    }
}
