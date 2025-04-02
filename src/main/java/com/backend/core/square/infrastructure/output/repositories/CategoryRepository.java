package com.backend.core.square.infrastructure.output.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.core.square.infrastructure.output.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

    Optional<CategoryEntity> findByName(String name);

}
