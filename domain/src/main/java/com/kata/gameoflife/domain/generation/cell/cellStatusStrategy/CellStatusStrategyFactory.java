package com.kata.gameoflife.domain.generation.cell.cellStatusStrategy;

import com.kata.gameoflife.domain.generation.cell.Status;
import com.kata.gameoflife.domain.structures.DomainException;

public class CellStatusStrategyFactory {

    public static CellStatusStrategy get(Status status) {
        switch (status) {
            case ALIVE:
                return new AliveCellStatusStrategy();
            case DEAD:
                return new DeadCellStatusStrategy();
            default:
                throw new DomainException("Unexpected Cell status: " + status);
        }
    }
}
