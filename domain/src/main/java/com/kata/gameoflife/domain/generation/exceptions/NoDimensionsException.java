package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class NoDimensionsException extends DomainException {
    public NoDimensionsException(String message) {
        super(message);
    }
}
