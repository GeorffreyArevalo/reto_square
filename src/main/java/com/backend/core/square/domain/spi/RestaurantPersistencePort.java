package com.backend.core.square.domain.spi;

import java.util.List;
import java.util.Optional;

import com.backend.core.square.domain.models.RestaurantModel;

public interface RestaurantPersistencePort {
    
    RestaurantModel create( RestaurantModel restaurant );

    Optional<RestaurantModel> findById(Long id);

    List<RestaurantModel> findAll();

}
