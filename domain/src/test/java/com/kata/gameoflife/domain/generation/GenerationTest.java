package com.kata.gameoflife.domain.generation;

import com.kata.gameoflife.domain.generation.exceptions.IncorrectHeightException;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectLengthException;
import com.kata.gameoflife.domain.generation.exceptions.NullPropertyException;
import com.kata.gameoflife.domain.generation.utils.CellMockUtils;
import com.kata.gameoflife.domain.generation.utils.DimensionsMockUtils;
import com.kata.gameoflife.domain.generation.utils.GenerationMockUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


public class GenerationTest {


    @Test
    public void GenerationCreationShouldThrowAnErrorIfDimensionAreNull() {
        int length = 3;
        int height = 3;
        try {
            Generation
                    .createBuilder()
                    .cells(CellMockUtils.getValidAllLivingCell(length, height))
                    .build();
            fail( "Generation Creation should throw an error on null dimension." );
        } catch (Exception exception) {
            assertTrue(exception instanceof NullPropertyException);
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
            assertTrue(exception instanceof NullPropertyException);
        }
    }

    @Test
    public void GenerationCreationShouldThrowAnErrorIfCellsHeightIsDifferentFromDimension() {
        try {
            Generation
                    .createBuilder()
                    .dimensions(DimensionsMockUtils.getValidDimensions())
                    .cells(CellMockUtils.getValidAllLivingCell(3, 2))
                    .build();
            fail( "Generation Creation should throw an error on different height than cells array." );
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectHeightException);
        }
    }


    @Test
    public void GenerationCreationShouldThrowAnErrorIfOneOfCellsLineIsDifferentFromDimension() {
        try {
            Generation
                    .createBuilder()
                    .dimensions(DimensionsMockUtils.getValidDimensions())
                    .cells(CellMockUtils.getTwoPerThreeAllLivingCellArray())
                    .build();
            fail( "Generation Creation should throw an error on wrong cells lines length." );
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectLengthException);
        }
    }

    @Test
    public void GenerationCreationShouldNotThrowAnyErrorOnACorrectGeneration() {
        GenerationMockUtils.getValidGeneration();
    }
}
