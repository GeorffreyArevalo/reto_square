package com.backend.core.square.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend.core.square.domain.api.CategoryServicePort;
import com.backend.core.square.domain.api.PlateServicePort;
import com.backend.core.square.domain.api.RestaurantServicePort;
import com.backend.core.square.domain.spi.CategoryPersistencePort;
import com.backend.core.square.domain.spi.PlatePersistencePort;
import com.backend.core.square.domain.spi.RestaurantPersistencePort;
import com.backend.core.square.domain.spi.UserClientPort;
import com.backend.core.square.domain.usescases.CategoryUseCases;
import com.backend.core.square.domain.usescases.PlateUseCases;
import com.backend.core.square.domain.usescases.RestaurantUseCases;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class CreateBeansConfiguration {
    
    private final RestaurantPersistencePort restaurantPersistencePort;
    private final UserClientPort userClientPort;
    private final PlatePersistencePort platePersistencePort;
    private final CategoryPersistencePort categoryPersistencePort;

    @Bean
    RestaurantServicePort restaurantServicePort() {
        return new RestaurantUseCases(restaurantPersistencePort, userClientPort);
    }

    @Bean
    CategoryServicePort categoryServicePort() {
        return new CategoryUseCases(categoryPersistencePort);
    }

    @Bean
    PlateServicePort plateServicePort() {
        return new PlateUseCases(platePersistencePort);
    }

}
