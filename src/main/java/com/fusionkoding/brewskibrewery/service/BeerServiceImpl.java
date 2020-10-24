package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.BeerDto;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO Auto-generated method stub
        log.debug("Updating a beer");
    }

    @Override
    public void deleteById(UUID beerId) {
        // TODO Auto-generated method stub
        log.debug("Deleting a beer");
    }

}
