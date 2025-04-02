package com.backend.core.square.application.dtos.plate;

import com.backend.core.square.application.dtos.category.CategoryResponse;
import com.backend.core.square.application.dtos.restaurant.RestaurantResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlateResponse {
    
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Boolean enable;
    private String urlImage;
    private CategoryResponse category;
    private RestaurantResponse restaurant;

}
