package com.backend.core.square.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend.core.square.domain.api.RestaurantServicePort;
import com.backend.core.square.domain.spi.RestaurantPersistencePort;
import com.backend.core.square.domain.spi.UserClientPort;
import com.backend.core.square.domain.usescases.RestaurantUseCases;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class CreateBeansConfiguration {
    
    private final RestaurantPersistencePort restaurantPersistencePort;
    private final UserClientPort userClientPort;

    @Bean
    RestaurantServicePort restaurantServicePort() {
        return new RestaurantUseCases(restaurantPersistencePort, userClientPort);
    }

}
