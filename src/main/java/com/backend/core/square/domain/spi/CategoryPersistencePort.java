package com.backend.core.square.domain.spi;

import java.util.Optional;

import com.backend.core.square.domain.models.CategoryModel;

public interface CategoryPersistencePort {
    Optional<CategoryModel> findByName( String name );

    CategoryModel save( CategoryModel categoryModel );
}
