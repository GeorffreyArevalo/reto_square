package com.backend.core.square.application.handlers.plate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.core.square.application.dtos.plate.CreatePlateRequest;
import com.backend.core.square.application.dtos.plate.PlateResponse;
import com.backend.core.square.application.mappers.PlateMapper;
import com.backend.core.square.domain.api.CategoryServicePort;
import com.backend.core.square.domain.api.PlateServicePort;
import com.backend.core.square.domain.api.RestaurantServicePort;
import com.backend.core.square.domain.models.CategoryModel;
import com.backend.core.square.domain.models.PlateModel;
import com.backend.core.square.domain.models.RestaurantModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PlateHandlerImpl implements PlateHandler{

    private final PlateServicePort plateServicePort;
    private final CategoryServicePort categoryServicePort;
    private final RestaurantServicePort restaurantServicePort;
    private final PlateMapper plateMapper;


    @Override
    public void save(CreatePlateRequest createPlateRequest) {
        createPlateRequest.validate();
        RestaurantModel restaurantModel = restaurantServicePort.findById(createPlateRequest.getRestaurantId());
        CategoryModel categoryModel = categoryServicePort.findByName(createPlateRequest.getCategoryName());

        PlateModel plate = plateMapper.createRequestToModel(createPlateRequest);
        plate.setCategory(categoryModel);
        plate.setRestaurant(restaurantModel);

        plateServicePort.create(plate);
    }

    @Override
    public PlateResponse findById(Long id) {
        return plateMapper.modelToResponse(plateServicePort.findById(id));
    }
    
}
