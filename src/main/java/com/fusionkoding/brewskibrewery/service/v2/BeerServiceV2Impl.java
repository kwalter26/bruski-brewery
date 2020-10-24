package com.fusionkoding.brewskibrewery.service.v2;

import java.util.UUID;

import com.fusionkoding.brewskibrewery.web.model.v2.BeerDtoV2;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(UUID beerId) {
        // TODO Auto-generated method stub

    }

}
