package com.backend.core.square.domain.api;

import com.backend.core.square.domain.models.PlateModel;

public interface PlateServicePort {
    
    PlateModel findById(Long id);

    void create(PlateModel plate);

    PlateModel update(PlateModel plate);

}
