package com.backend.core.square.infrastructure.handlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.backend.core.square.domain.exception.SquareException;

@RestControllerAdvice
public class ExceptionHandlerController {
    

    @ExceptionHandler( exception = SquareException.class )
    public ResponseEntity<ExceptionResponse> usersExceptionHandler( SquareException exception ) {
        ExceptionResponse exceptionResponse = ExceptionResponse.builder().code( exception.getStatusCode() ).error( exception.getMessage() ).build();
        return ResponseEntity.status( exception.getStatusCode() ).body(exceptionResponse);
    }


}
