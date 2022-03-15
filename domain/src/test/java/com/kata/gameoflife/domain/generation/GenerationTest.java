package com.kata.gameoflife.domain.generation;

import com.kata.gameoflife.domain.generation.exceptions.NoCellsException;
import com.kata.gameoflife.domain.generation.exceptions.NoDimensionsException;
import com.kata.gameoflife.domain.generation.utils.CellMockUtils;
import com.kata.gameoflife.domain.generation.utils.DimensionsMockUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


public class GenerationTest {


    @Test
    public void GenerationCreationShouldThrowAnErrorIfDimensionIsNull() {
        int length = 3;
        int height = 3;
        try {
            Generation
                    .createBuilder()
                    .cells(CellMockUtils.getValidAllLivingCell(length, height))
                    .build();
            fail( "Generation Creation should throw an error on null dimension." );
        } catch (Exception exception) {
            assertTrue(exception instanceof NoDimensionsException);
        }
    }


    @Test
    public void GenerationCreationShouldThrowAnErrorIfCellsAreNull() {
        try {
            Generation
                    .createBuilder()
                    .dimensions(DimensionsMockUtils.getValidDimensions())
                    .build();
            fail( "Generation Creation should throw an error on null cells." );
        } catch (Exception exception) {
            assertTrue(exception instanceof NoCellsException);
        }
    }
}
