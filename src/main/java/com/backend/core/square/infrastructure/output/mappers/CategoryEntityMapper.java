package com.backend.core.square.infrastructure.output.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.domain.models.CategoryModel;
import com.backend.core.square.infrastructure.output.entities.CategoryEntity;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CategoryEntityMapper {
    
    CategoryModel entityToModel( CategoryEntity categoryEntity );

    CategoryEntity modelToEntity( CategoryModel categoryModel );


}
