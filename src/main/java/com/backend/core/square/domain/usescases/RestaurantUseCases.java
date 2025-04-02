package com.backend.core.square.domain.usescases;

import java.util.List;

import com.backend.core.square.domain.api.RestaurantServicePort;
import com.backend.core.square.domain.exception.BadRequestException;
import com.backend.core.square.domain.models.RestaurantModel;
import com.backend.core.square.domain.models.UserModel;
import com.backend.core.square.domain.spi.RestaurantPersistencePort;
import com.backend.core.square.domain.spi.UserClientPort;

public class RestaurantUseCases implements RestaurantServicePort{

    private final RestaurantPersistencePort restaurantPersistencePort;
    private final UserClientPort userClientPort;

    public RestaurantUseCases(RestaurantPersistencePort restaurantPersistencePort, UserClientPort userClientPort) {
        this.restaurantPersistencePort = restaurantPersistencePort;
        this.userClientPort = userClientPort;
    }

    @Override
    public void create(RestaurantModel restaurant) {
        UserModel user = userClientPort.findById(restaurant.getIdUser());
        if (user.getRoleName() == null || !user.getRoleName().equals("ROLE_OWNER")) {
            throw new BadRequestException(400, "El rol del usuario enviado no corresponde a un propietario.");
        }
        restaurantPersistencePort.create(restaurant);
    }

    @Override
    public List<RestaurantModel> findAll() {
        return restaurantPersistencePort.findAll();
    }

    @Override
    public RestaurantModel findById(Long id) {
        return restaurantPersistencePort.findById(id).orElseThrow( () -> new BadRequestException(404, String.format("El restaurante con id %s no existe.", id)) );
    }
    
}
