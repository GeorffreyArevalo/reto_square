package com.backend.core.square.application.dtos.category;

import com.backend.core.square.domain.exception.BadRequestException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryRequest {
    
    private String name;
    private String description;

    public void validate() {
        if( name == null || name.isEmpty() ) throw new BadRequestException(400, "El nombre es obligatorio.");
    }

}
