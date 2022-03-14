package com.kata.gameoflife.domain.structures;

public class DomainException extends RuntimeException {
    public final String message;
    public DomainException(String message) {
        this.message = message;
    }
}
