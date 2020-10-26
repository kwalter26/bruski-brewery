package com.fusionkoding.brewskibrewery.web.mappers;

import com.fusionkoding.brewskibrewery.domain.Customer;
import com.fusionkoding.brewskibrewery.web.model.CustomerDto;

import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
