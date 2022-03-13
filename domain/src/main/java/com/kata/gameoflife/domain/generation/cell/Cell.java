package com.kata.gameoflife.domain.generation.cell;


import com.kata.gameoflife.domain.generation.cell.cellStatusStrategy.CellStatusStrategyFactory;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

@Builder
@Getter
@ToString
public class Cell {
    private final Coordinates coordinates;
    private final Status status;

    private final int ALIVE_LIMIT_CONDITION = 3;


    public Status getNextStatus(Cell[] neighbors) {
        return CellStatusStrategyFactory.get(this.status).getNextStatus(neighbors);
    }
}
