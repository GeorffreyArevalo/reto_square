package com.backend.core.square.domain.usescases;

import com.backend.core.square.domain.api.PlateServicePort;
import com.backend.core.square.domain.exception.BadRequestException;
import com.backend.core.square.domain.exception.DataNotFoundException;
import com.backend.core.square.domain.models.PlateModel;
import com.backend.core.square.domain.spi.PlatePersistencePort;

public class PlateUseCases implements PlateServicePort {

    private final PlatePersistencePort platePersistencePort;
    
    public PlateUseCases(PlatePersistencePort platePersistencePort) {
        this.platePersistencePort = platePersistencePort;
    }

    @Override
    public PlateModel findById(Long id) {
        return platePersistencePort.findById(id).orElseThrow(() -> new DataNotFoundException(404, String.format("Plato con id %s no existe.", id)));
    }

    @Override
    public void create(PlateModel plate) {
        platePersistencePort.save(plate);
    }

    @Override
    public PlateModel update(PlateModel plate) {
        platePersistencePort.findById(plate.getId()).orElseThrow(() -> new BadRequestException(400, String.format("El plato que desea actualizar con id %s no existe.", plate.getId())));
        return platePersistencePort.save(plate);
    }

    
    
}
