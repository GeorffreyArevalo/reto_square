package com.backend.core.square.application.handlers.restaurant;

import java.util.List;

import com.backend.core.square.application.dtos.restaurant.CreateRestaurantRequest;
import com.backend.core.square.application.dtos.restaurant.RestaurantResponse;

public interface RestaurantHandler {
    
    void create( CreateRestaurantRequest createRestaurantRequest );

    List<RestaurantResponse> findAll();

}
