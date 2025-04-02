package com.backend.core.square.application.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.application.dtos.plate.CreatePlateRequest;
import com.backend.core.square.application.dtos.plate.PlateResponse;
import com.backend.core.square.domain.models.PlateModel;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = {RestaurantMapper.class, CategoryMapper.class}
)
public interface PlateMapper {
    
    PlateModel createRequestToModel( CreatePlateRequest createPlateRequest );

    PlateResponse modelToResponse( PlateModel plateModel );

}
