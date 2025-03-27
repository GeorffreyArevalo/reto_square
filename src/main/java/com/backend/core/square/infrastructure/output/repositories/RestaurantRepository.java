package com.backend.core.square.infrastructure.output.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.core.square.infrastructure.output.entities.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long>{
    
}
