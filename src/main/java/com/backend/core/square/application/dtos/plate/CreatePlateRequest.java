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
public class CreatePlateRequest {

    private String name;
    private String description;
    private Long price;
    private Boolean enable;
    private String urlImage;
    private String categoryName;
    private Long restaurantId;

    public void validate() {

        if( name == null || name.isEmpty() ) throw new BadRequestException(400, "El nombre es obligatorio.");
        if( description == null || description.isEmpty() ) throw new BadRequestException(400, "La descripción es obligatoria.");
        if( urlImage == null || urlImage.isEmpty() ) throw new BadRequestException(400, "La Url de la imagen es obligatoria.");
        if( categoryName == null || categoryName.isEmpty() ) throw new BadRequestException(400, "El nombre de la categoría es obligatoria.");
        if( price == null || price < 0 ) throw new BadRequestException(400, "El precio debe ser un número entero mayor a cero.");

    }

    
}
