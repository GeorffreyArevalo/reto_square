package com.backend.core.square.application.dtos.plate;

import com.backend.core.square.domain.exception.BadRequestException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePlateRequest {
    
    private Long price;
    private String description;

    public void validate() {

        if( price != null && price < 0 ) throw new BadRequestException(400, "El precio debe ser mayor a cero.");
        if( description != null && description.isEmpty() ) throw new BadRequestException(400, "La descripción no puede ser vacía.");

    }

}
