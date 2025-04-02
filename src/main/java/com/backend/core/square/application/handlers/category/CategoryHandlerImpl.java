package com.backend.core.square.application.handlers.category;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.core.square.application.dtos.category.CategoryResponse;
import com.backend.core.square.application.dtos.category.CreateCategoryRequest;
import com.backend.core.square.application.mappers.CategoryMapper;
import com.backend.core.square.domain.api.CategoryServicePort;
import com.backend.core.square.domain.models.CategoryModel;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@Transactional
public class CategoryHandlerImpl implements CategoryHandler{

    private final CategoryServicePort categoryServicePort;
    private final CategoryMapper categoryMapper;
    

    @Override
    public void createCategory(CreateCategoryRequest createCategoryRequest) {
        createCategoryRequest.validate();
        CategoryModel categoryModel = categoryMapper.createRequestToModel(createCategoryRequest);
        categoryServicePort.createCategory(categoryModel);
    }

    @Override
    public CategoryResponse findByName(String name) {
        return categoryMapper.modelToResponse(categoryServicePort.findByName(name));
    }
    
}
