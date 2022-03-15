package com.kata.gameoflife.domain.generation.utils;

import com.kata.gameoflife.domain.generation.cell.Coordinates;

public class CoordinatesMockUtils {

    static Coordinates getValidCoordinates() {
        return Coordinates.createBuilder()
                .x(0)
                .y(0)
                .build();
    }
}
