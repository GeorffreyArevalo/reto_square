package com.backend.core.square.infrastructure.output.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.domain.models.RestaurantModel;
import com.backend.core.square.infrastructure.output.entities.RestaurantEntity;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RestaurantEntityMapper {
    
    RestaurantModel entityToModel( RestaurantEntity entity );

    RestaurantEntity modelToEntity( RestaurantModel model );

    List<RestaurantModel> listEntityToModel( List<RestaurantEntity> entities );


}
