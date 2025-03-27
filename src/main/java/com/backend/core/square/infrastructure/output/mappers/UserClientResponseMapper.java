package com.backend.core.square.infrastructure.output.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.backend.core.square.domain.models.UserModel;
import com.backend.core.square.infrastructure.output.dtos.responses.UserResponse;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserClientResponseMapper {
    
    UserModel responseToModel(UserResponse userResponse);
    

}
