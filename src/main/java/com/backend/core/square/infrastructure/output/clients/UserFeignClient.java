package com.backend.core.square.infrastructure.output.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.backend.core.square.infrastructure.output.dtos.responses.UserResponse;

@FeignClient( name = "users", url = "http://localhost:8090" )
public interface UserFeignClient {
    
    @GetMapping("/user/{id}")
    UserResponse findById(@PathVariable(name = "id") Long id);

}
