package com.backend.core.square.domain.api;

import java.util.List;

import com.backend.core.square.domain.models.RestaurantModel;

public interface RestaurantServicePort {
    
    void create(RestaurantModel restaurant);

    List<RestaurantModel> findAll();

}
