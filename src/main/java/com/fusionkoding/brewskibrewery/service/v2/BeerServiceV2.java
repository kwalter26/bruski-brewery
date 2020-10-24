package com.fusionkoding.brewskibrewery.service.v2;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.v2.BeerDtoV2;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 createBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
