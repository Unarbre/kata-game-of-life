package com.kata.gameoflife.domain.generation.cell;


import com.kata.gameoflife.domain.generation.cell.cellStatusStrategy.CellStatusStrategyFactory;
import com.kata.gameoflife.domain.structures.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Cell implements Entity {
    private final Coordinates coordinates;
    private final Status status;

    private final int ALIVE_LIMIT_CONDITION = 3;


    public Status getNextStatus(Cell[] neighbors) {
        return CellStatusStrategyFactory.get(this.status).getNextStatus(neighbors);
    }
}
