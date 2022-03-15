package com.kata.gameoflife.domain.generation.utils;

import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Cell;

import java.util.concurrent.atomic.AtomicInteger;

public class GenerationMockUtils {

    static Generation getValidGeneration() {

        Cell[][] cells = {
                {
                        CellMockUtils.getValidLivingCell(0, 0),
                        CellMockUtils.getValidLivingCell(1, 0),
                },
                {
                        CellMockUtils.getValidLivingCell(0, 1),
                        CellMockUtils.getValidLivingCell(1, 1),
                }
        };

        return Generation.getBuilder()
                .dimensions(DimensionsMockUtils.getValidDimensions())
                .cells(cells)
                .build();
    }
}
