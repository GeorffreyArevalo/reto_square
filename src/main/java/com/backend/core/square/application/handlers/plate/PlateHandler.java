package com.backend.core.square.application.handlers.plate;

import com.backend.core.square.application.dtos.plate.CreatePlateRequest;
import com.backend.core.square.application.dtos.plate.PlateResponse;
import com.backend.core.square.application.dtos.plate.UpdatePlateRequest;

public interface PlateHandler {
    
    void save(CreatePlateRequest createPlateRequest);

    PlateResponse update( Long id, UpdatePlateRequest updatePlateRequest );

    PlateResponse findById(Long id);

}
