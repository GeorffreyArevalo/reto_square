package com.backend.core.square.application.handlers.plate;

import com.backend.core.square.application.dtos.plate.CreatePlateRequest;
import com.backend.core.square.application.dtos.plate.PlateResponse;

public interface PlateHandler {
    
    void save(CreatePlateRequest createPlateRequest);

    PlateResponse findById(Long id);

}
