package com.test.spring.rest.exeption_handling;

public class NoSuchEmployeeException extends Exception {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
