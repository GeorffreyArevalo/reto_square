package com.backend.core.square.infrastructure.output.dtos.responses;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String name;
    private String lastname;
    private String document;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private String roleName;
}
