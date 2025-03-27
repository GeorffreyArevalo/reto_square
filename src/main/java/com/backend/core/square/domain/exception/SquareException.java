package com.backend.core.square.domain.exception;

public class SquareException extends RuntimeException{
    
    private final Integer statusCode;

    public SquareException(Integer statusCode, String message) {
        super(message); 
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

}
