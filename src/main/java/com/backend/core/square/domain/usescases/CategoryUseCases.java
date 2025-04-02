package com.backend.core.square.domain.usescases;

import java.util.Optional;

import com.backend.core.square.domain.api.CategoryServicePort;
import com.backend.core.square.domain.exception.BadRequestException;
import com.backend.core.square.domain.exception.DataNotFoundException;
import com.backend.core.square.domain.models.CategoryModel;
import com.backend.core.square.domain.spi.CategoryPersistencePort;

public class CategoryUseCases implements CategoryServicePort{

    private final CategoryPersistencePort categoryPersistencePort;

    public CategoryUseCases(CategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public CategoryModel createCategory(CategoryModel categoryModel) {
        Optional<CategoryModel> categoryFound = categoryPersistencePort.findByName(categoryModel.getName());
        if( categoryFound.isPresent() ) {
            throw new BadRequestException(404, String.format("Categoría con nombre %s ya existe.", categoryModel.getName()));
        }
        return categoryPersistencePort.save(categoryModel);
    }

    @Override
    public CategoryModel findByName(String name) {
        return categoryPersistencePort.findByName(name)
        .orElseThrow(() -> new DataNotFoundException(404, String.format("Categoría con nombre %s no existe.", name)));
        
    }
    
}
