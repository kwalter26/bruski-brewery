package com.fusionkoding.brewskibrewery.service;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
