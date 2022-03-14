package com.kata.gameoflife.application.structures;

public class ApplicationException extends RuntimeException {

    public final String message;
    public ApplicationException(String message) {
        this.message = message;
    }
}
