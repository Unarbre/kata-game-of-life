package com.kata.gameoflife.domain.generation.utils;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Coordinates;
import com.kata.gameoflife.domain.generation.cell.Status;

import java.util.stream.IntStream;

public class CellMockUtils {

    public static Cell[][] getValidAllLivingCell(int height, int length) {

        return IntStream.range(0, height)
                .mapToObj(y -> IntStream.range(0, length)
                        .mapToObj(x -> CellMockUtils.getValidLivingCell(x, y))
                        .toArray(Cell[]::new)).toArray(Cell[][]::new);
    }

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
