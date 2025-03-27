package com.backend.core.square.domain.exception;

public class BadRequestException extends SquareException {

    public BadRequestException(Integer statusCode, String message) {
        super(statusCode, message);
    }
}

