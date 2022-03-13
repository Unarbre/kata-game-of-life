package com.kata.gameoflife.domain.generation.cell;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Cell {
    private final Coordinates coordinates;
    private final Liveness liveness;
}
