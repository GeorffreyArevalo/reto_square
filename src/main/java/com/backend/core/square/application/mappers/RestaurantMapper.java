package com.backend.core.square.application.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.application.dtos.restaurant.CreateRestaurantRequest;
import com.backend.core.square.application.dtos.restaurant.RestaurantResponse;
import com.backend.core.square.domain.models.RestaurantModel;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RestaurantMapper {
    
    RestaurantModel createRequestToModel( CreateRestaurantRequest createRestaurantRequest );

    RestaurantResponse modelToResponse( RestaurantModel restaurantModel );

    List<RestaurantResponse> listModelToResponseList( List<RestaurantModel> restaurantModel );


}
