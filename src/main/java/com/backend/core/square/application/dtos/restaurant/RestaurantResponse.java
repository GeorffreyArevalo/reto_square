package com.backend.core.square.application.dtos.restaurant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantResponse {
    
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String urlLogo;
    private String nit;

}
