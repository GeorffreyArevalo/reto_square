package com.backend.core.square.application.handlers.category;

import com.backend.core.square.application.dtos.category.CategoryResponse;
import com.backend.core.square.application.dtos.category.CreateCategoryRequest;

public interface CategoryHandler {
    
    void createCategory( CreateCategoryRequest createCategoryRequest );

    CategoryResponse findByName(String name);

}
