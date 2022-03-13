package com.kata.gameoflife.domain.generation.cell.cellStatusStrategy;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Status;

public interface CellStatusStrategy {

    Status getNextStatus(Cell[] neighbors);
}
