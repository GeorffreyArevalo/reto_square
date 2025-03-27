package com.backend.core.square.infrastructure.input.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.core.square.application.dtos.restaurant.CreateRestaurantRequest;
import com.backend.core.square.application.dtos.restaurant.RestaurantResponse;
import com.backend.core.square.application.handlers.restaurant.RestaurantHandler;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {
    
    private final RestaurantHandler restaurantHandler;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateRestaurantRequest createRestaurantRequest) {
        restaurantHandler.create(createRestaurantRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<RestaurantResponse>> findAll() {
        return ResponseEntity.ok( restaurantHandler.findAll() );
    }
    
    


}
