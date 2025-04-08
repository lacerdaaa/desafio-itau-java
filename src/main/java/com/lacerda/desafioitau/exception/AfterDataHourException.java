package com.lacerda.desafioitau.exception;

public class AfterDataHourException extends RuntimeException {
    public AfterDataHourException(String message) {
        super(message);
    }
}
