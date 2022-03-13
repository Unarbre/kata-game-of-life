package com.kata.gameoflife.domain.generation.cell.cellStatusStrategy;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Status;

import java.util.Arrays;

public class AliveCellStatusStrategy implements CellStatusStrategy {

    int LIVE_MAXIMUM = 3;
    int LIVE_MINIMUM = 2;


    @Override
    public Status getNextStatus(Cell[] neighbors) {
        var livingCellsQuantity = Arrays.stream(neighbors).filter(cell -> cell.getStatus().equals(Status.ALIVE)).count();
        return (livingCellsQuantity <= LIVE_MAXIMUM && livingCellsQuantity >= LIVE_MINIMUM)
                ? Status.ALIVE
                : Status.DEAD;
    }
}
