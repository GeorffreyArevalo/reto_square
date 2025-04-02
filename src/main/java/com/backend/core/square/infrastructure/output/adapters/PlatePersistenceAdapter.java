package com.backend.core.square.infrastructure.output.adapters;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.backend.core.square.domain.models.PlateModel;
import com.backend.core.square.domain.spi.PlatePersistencePort;
import com.backend.core.square.infrastructure.output.entities.PlateEntity;
import com.backend.core.square.infrastructure.output.mappers.PlateEntityMapper;
import com.backend.core.square.infrastructure.output.repositories.PlateRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PlatePersistenceAdapter implements PlatePersistencePort{

    private final PlateRepository plateRepository;
    private final PlateEntityMapper plateEntityMapper;

    @Override
    public PlateModel save(PlateModel plate) {
        PlateEntity plateEntity = plateEntityMapper.modelToEntity(plate);
        PlateEntity savedPlate = plateRepository.save(plateEntity);
        return plateEntityMapper.entityToModel(savedPlate);
    }

    @Override
    public Optional<PlateModel> findById(Long id) {
        Optional<PlateEntity> plateOptional = plateRepository.findById(id);
        return plateOptional.map( plateEntityMapper::entityToModel );
    }
    
}
