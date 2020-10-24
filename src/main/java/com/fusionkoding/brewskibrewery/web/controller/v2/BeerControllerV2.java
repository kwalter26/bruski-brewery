package com.fusionkoding.brewskibrewery.web.controller.v2;

import java.net.URI;
import java.util.UUID;

import com.fusionkoding.brewskibrewery.service.v2.BeerServiceV2;
import com.fusionkoding.brewskibrewery.web.model.v2.BeerDtoV2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId) {
        return ResponseEntity.ok(beerService.getBeerById(beerId));
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> createBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 savedBeer = beerService.createBeer(beerDto);
        return ResponseEntity.created(URI.create("/api/v1/beer/" + savedBeer.getId())).body(savedBeer);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> handleUpdate(@PathVariable UUID beerId, BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(UUID beerId) {
        beerService.deleteById(beerId);
    }

}
