package com.kata.gameoflife.domain.generation.utils;

import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Cell;

import java.util.concurrent.atomic.AtomicInteger;

public class GenerationMockUtils {

    public static Generation getValidGeneration() {

        var dimensions = DimensionsMockUtils.getValidDimensions();
        return Generation.getBuilder()
                .dimensions(dimensions)
                .cells(CellMockUtils.getValidAllLivingCell(dimensions.getHeight(), dimensions.getLength()))
                .build();
    }
}
