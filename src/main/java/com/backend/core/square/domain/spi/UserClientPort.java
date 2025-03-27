package com.backend.core.square.domain.spi;

import com.backend.core.square.domain.models.UserModel;

public interface UserClientPort {
    
    UserModel findById(Long id);

}
