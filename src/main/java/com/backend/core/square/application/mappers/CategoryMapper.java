package com.backend.core.square.application.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.application.dtos.category.CategoryResponse;
import com.backend.core.square.application.dtos.category.CreateCategoryRequest;
import com.backend.core.square.domain.models.CategoryModel;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CategoryMapper {
    
    CategoryModel createRequestToModel( CreateCategoryRequest categoryRequest );

    CategoryResponse modelToResponse( CategoryModel categoryModel );


}
