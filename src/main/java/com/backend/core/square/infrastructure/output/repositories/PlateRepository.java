package com.backend.core.square.infrastructure.output.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.core.square.infrastructure.output.entities.PlateEntity;

public interface PlateRepository extends JpaRepository<PlateEntity, Long>{
    
}
