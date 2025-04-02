package com.backend.core.square.domain.spi;

import java.util.Optional;

import com.backend.core.square.domain.models.PlateModel;

public interface PlatePersistencePort {
    
    PlateModel save(PlateModel plate);

    Optional<PlateModel> findById(Long id);

}
