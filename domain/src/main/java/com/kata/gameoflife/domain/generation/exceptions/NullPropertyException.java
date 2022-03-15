package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class NullPropertyException extends DomainException {
    public NullPropertyException(String message) {
        super(message);
    }
}
