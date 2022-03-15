package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class IncorrectHeightException extends DomainException {
    public IncorrectHeightException(String message) {
        super(message);
    }
}
