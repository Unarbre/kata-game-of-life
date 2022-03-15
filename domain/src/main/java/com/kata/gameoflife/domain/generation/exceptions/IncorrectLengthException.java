package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class IncorrectLengthException extends DomainException {
    public IncorrectLengthException(String message) {
        super(message);
    }
}
