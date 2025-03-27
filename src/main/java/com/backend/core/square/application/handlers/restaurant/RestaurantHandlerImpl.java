package com.backend.core.square.application.handlers.restaurant;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.core.square.application.dtos.restaurant.CreateRestaurantRequest;
import com.backend.core.square.application.dtos.restaurant.RestaurantResponse;
import com.backend.core.square.application.mappers.RestaurantMapper;
import com.backend.core.square.domain.api.RestaurantServicePort;
import com.backend.core.square.domain.models.RestaurantModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class RestaurantHandlerImpl implements RestaurantHandler{

    private final RestaurantServicePort restaurantServicePort;
    private final RestaurantMapper restaurantMapper;

    @Override
    public void create(CreateRestaurantRequest createRestaurantRequest) {
        createRestaurantRequest.validate();
        RestaurantModel restaurantModel = restaurantMapper.createRequestToModel(createRestaurantRequest);
        restaurantServicePort.create(restaurantModel);
    }

    @Override
    public List<RestaurantResponse> findAll() {
        return restaurantMapper.listModelToResponseList(restaurantServicePort.findAll());
    }
    
}
