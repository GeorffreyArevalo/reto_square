package com.backend.core.square.application.dtos.restaurant;

import com.backend.core.square.application.utils.RegexConstant;
import com.backend.core.square.domain.exception.BadRequestException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateRestaurantRequest {
    
    private String name;
    private String address;
    private String phone;
    private String urlLogo;
    private String nit;
    private Long idUser;

    public void validate() {

        if( address == null || address.isEmpty() ) throw new BadRequestException(400, "La dirección es obligatoria.");
        if( urlLogo == null || urlLogo.isEmpty() ) throw new BadRequestException(400, "La URL del logo es obligatoria.");

        if( name == null || !name.matches(RegexConstant.patternNoOnlyNumbers) ) throw new BadRequestException(400, "El nombre debe ser válido.");
        if( nit == null || !nit.matches(RegexConstant.patternOnlyNumber) ) throw new BadRequestException(400, "El NIT debe ser válido.");
        if( phone == null || !phone.matches(RegexConstant.patternPhone) ) throw new BadRequestException(400, "El teléfono debe ser válido.");

    }



}
