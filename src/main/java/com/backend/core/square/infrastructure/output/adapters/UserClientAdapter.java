package com.backend.core.square.infrastructure.output.adapters;

import org.springframework.stereotype.Component;

import com.backend.core.square.domain.models.UserModel;
import com.backend.core.square.domain.spi.UserClientPort;
import com.backend.core.square.infrastructure.output.clients.UserFeignClient;
import com.backend.core.square.infrastructure.output.dtos.responses.UserResponse;
import com.backend.core.square.infrastructure.output.mappers.UserClientResponseMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserClientAdapter implements UserClientPort {
    
    private final UserFeignClient userFeignClient;
    private final UserClientResponseMapper userClientResponseMapper;

    @Override
    public UserModel findById(Long id) {
        UserResponse userResponse = userFeignClient.findById(id);
        return userClientResponseMapper.responseToModel(userResponse);
    }
    
}
