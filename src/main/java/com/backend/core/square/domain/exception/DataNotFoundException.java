package com.backend.core.square.domain.exception;

public class DataNotFoundException extends SquareException{

    public DataNotFoundException(Integer statusCode, String message) {
        super(statusCode, message);
    }
    
}
