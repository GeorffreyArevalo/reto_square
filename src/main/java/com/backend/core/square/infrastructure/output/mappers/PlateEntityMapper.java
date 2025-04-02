package com.backend.core.square.infrastructure.output.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.domain.models.PlateModel;
import com.backend.core.square.infrastructure.output.entities.PlateEntity;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = { RestaurantEntityMapper.class, CategoryEntityMapper.class }
)
public interface PlateEntityMapper {
    
    PlateModel entityToModel( PlateEntity plateEntity );

    PlateEntity modelToEntity( PlateModel plateModel );

}
