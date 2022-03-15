package com.kata.gameoflife.domain.generation.exceptions;

import com.kata.gameoflife.domain.structures.DomainException;

public class IncorrectCoordinateInformationException extends DomainException {
    public IncorrectCoordinateInformationException(String message) {
        super(message);
    }
}
