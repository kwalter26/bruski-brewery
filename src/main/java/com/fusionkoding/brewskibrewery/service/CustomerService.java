package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
