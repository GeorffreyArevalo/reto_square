package com.backend.core.square.domain.api;

import com.backend.core.square.domain.models.CategoryModel;

public interface CategoryServicePort {
    CategoryModel createCategory(CategoryModel categoryModel);

    CategoryModel findByName(String name);
}
