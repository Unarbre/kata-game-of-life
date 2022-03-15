package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class NoCellsException extends DomainException {
    public NoCellsException(String message) {
        super(message);
    }
}
