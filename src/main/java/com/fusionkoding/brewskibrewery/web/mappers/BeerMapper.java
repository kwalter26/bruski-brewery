package com.fusionkoding.brewskibrewery.web.mappers;

import com.fusionkoding.brewskibrewery.domain.Beer;
import com.fusionkoding.brewskibrewery.web.model.BeerDto;

import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
