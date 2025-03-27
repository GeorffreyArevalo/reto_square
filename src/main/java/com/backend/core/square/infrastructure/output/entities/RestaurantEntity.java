package com.backend.core.square.infrastructure.output.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "restaurants" )
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @NotEmpty
    private String name;
    
    @NotEmpty
    private String address;
    
    @NotEmpty
    private String phone;
    
    @NotEmpty
    private String urlLogo;
    
    @NotEmpty
    private String nit;
    
    private Long idUser;


}
