package com.backend.core.square.infrastructure.output.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.backend.core.square.domain.models.RestaurantModel;
import com.backend.core.square.domain.spi.RestaurantPersistencePort;
import com.backend.core.square.infrastructure.output.entities.RestaurantEntity;
import com.backend.core.square.infrastructure.output.mappers.RestaurantEntityMapper;
import com.backend.core.square.infrastructure.output.repositories.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RestaurantPersistenceAdapter implements RestaurantPersistencePort{

    private final RestaurantRepository restaurantRepository;
    private final RestaurantEntityMapper restaurantEntityMapper;

    @Override
    public Optional<RestaurantModel> create(RestaurantModel restaurant) {
        RestaurantEntity entity = restaurantEntityMapper.modelToEntity(restaurant);
        RestaurantEntity savedEntity = restaurantRepository.save(entity);
        return Optional.of( restaurantEntityMapper.entityToModel(savedEntity) );
    }

    @Override
    public List<RestaurantModel> findAll() {
        return restaurantEntityMapper.listEntityToModel( restaurantRepository.findAll() );
    }
    
}
