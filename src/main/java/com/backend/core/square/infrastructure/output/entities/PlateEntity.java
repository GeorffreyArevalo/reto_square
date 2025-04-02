package com.backend.core.square.infrastructure.output.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "plates" )
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlateEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @NotEmpty
    private String name;
    
    @NotEmpty
    private String description;
    
    private Long price;
    
    private Boolean enable;
    
    @NotEmpty
    private String urlImage;

    @ManyToOne( fetch = FetchType.LAZY )
    private CategoryEntity category;
    
    @ManyToOne( fetch = FetchType.LAZY )
    private RestaurantEntity restaurant;

    @PrePersist
    public void prePersist() {
        if( enable == null ) {
            enable = true;
        }
    }

}
