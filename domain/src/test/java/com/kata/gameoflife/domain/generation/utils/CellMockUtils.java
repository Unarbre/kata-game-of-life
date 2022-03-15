package com.kata.gameoflife.domain.generation.utils;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Coordinates;
import com.kata.gameoflife.domain.generation.cell.Status;

public class CellMockUtils {

    static Cell getValidLivingCell(int coordinatesX, int coordinatesY) {
        return Cell.getBuilder()
                .coordinates(Coordinates.getBuilder()
                        .x(coordinatesX)
                        .y(coordinatesY)
                        .build())
                .status(Status.ALIVE)
                .build();
    }

    static Cell getValidDeadCell(int coordinatesX, int coordinatesY) {
        return Cell.getBuilder()
                .coordinates(Coordinates.getBuilder()
                        .x(coordinatesX)
                        .y(coordinatesY)
                        .build())
                .status(Status.DEAD)
                .build();
    }
}
