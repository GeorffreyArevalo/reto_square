package com.backend.core.square.infrastructure.output.adapters;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.backend.core.square.domain.models.CategoryModel;
import com.backend.core.square.domain.spi.CategoryPersistencePort;
import com.backend.core.square.infrastructure.output.entities.CategoryEntity;
import com.backend.core.square.infrastructure.output.mappers.CategoryEntityMapper;
import com.backend.core.square.infrastructure.output.repositories.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoryPersistenceAdapter implements CategoryPersistencePort{
    
    private final CategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Override
    public Optional<CategoryModel> findByName(String name) {
        Optional<CategoryEntity> categoryOptional = categoryRepository.findByName(name);
        return categoryOptional.map( categoryEntityMapper::entityToModel );
    }

    @Override
    public CategoryModel save(CategoryModel categoryModel) {
        CategoryEntity categoryEntity = categoryEntityMapper.modelToEntity(categoryModel);
        CategoryEntity categorySaved = categoryRepository.save(categoryEntity);
        return categoryEntityMapper.entityToModel(categorySaved);
    }
    
    

}
