package com.backend.core.square.domain.api;

import java.util.List;

import com.backend.core.square.domain.models.RestaurantModel;

public interface RestaurantServicePort {
    
    void create(RestaurantModel restaurant);

    RestaurantModel findById(Long id);

    List<RestaurantModel> findAll();

}
