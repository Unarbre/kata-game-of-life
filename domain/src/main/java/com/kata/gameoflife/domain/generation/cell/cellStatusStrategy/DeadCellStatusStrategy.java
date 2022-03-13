package com.kata.gameoflife.domain.generation.cell.cellStatusStrategy;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Status;

import java.util.Arrays;

public class DeadCellStatusStrategy implements CellStatusStrategy {

    int RESURRECTION_LIMIT = 3;

    @Override
    public Status getNextStatus(Cell[] neighbors) {
        var livingCellsQuantity = Arrays.stream(neighbors).filter(cell -> cell.getStatus().equals(Status.ALIVE)).count();

        return livingCellsQuantity == RESURRECTION_LIMIT
                ? Status.ALIVE
                : Status.DEAD;
    }
}
