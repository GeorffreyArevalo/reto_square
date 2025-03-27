package com.backend.core.square.domain.spi;

import java.util.List;
import java.util.Optional;

import com.backend.core.square.domain.models.RestaurantModel;

public interface RestaurantPersistencePort {
    
    Optional<RestaurantModel> create( RestaurantModel restaurant );

    List<RestaurantModel> findAll();

}
