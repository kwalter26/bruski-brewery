package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.BeerDto;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId).beerName("Guiness").beerStyle("Stout").build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        beerDto.setId(UUID.randomUUID());
        return beerDto;
    }

}
