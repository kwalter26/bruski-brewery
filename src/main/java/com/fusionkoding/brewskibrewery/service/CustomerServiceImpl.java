package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(customerId).name("Rollo Walter").build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        customerDto.setId(UUID.randomUUID());
        return customerDto;
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO Auto-generated method stub
        log.debug("Updating customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        // TODO Auto-generated method stub
        log.debug("Deleting customer");
    }
}
