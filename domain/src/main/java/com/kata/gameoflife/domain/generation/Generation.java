package com.kata.gameoflife.domain.generation;


import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.structures.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Generation implements Entity {
    private final Dimensions dimensions;
    private final Cell[][] cells;
}



