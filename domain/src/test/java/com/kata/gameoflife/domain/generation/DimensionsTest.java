package com.kata.gameoflife.domain.generation;

import com.kata.gameoflife.domain.generation.exceptions.IncorrectHeightException;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectLengthException;
import com.kata.gameoflife.domain.generation.utils.DimensionsMockUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class DimensionsTest {

    @Test
    public void shouldThrowErrorOnHeightInferiorOrEqualZero() {
        try {
            Dimensions.createBuilder()
                    .height(0)
                    .length(3)
                    .build();
            fail("Generation Creation should throw an error on height being inferior or equal to 0");
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectLengthException);
        }
    }

    @Test
    public void shouldThrowErrorOnLengthInferiorOrEqualZero() {
        try {
            Dimensions.createBuilder()
                    .height(3)
                    .length(0)
                    .build();
            fail("Generation Creation should throw an error on height being inferior or equal to 0");
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectHeightException);
        }
    }


    @Test
    public void shouldNotThrowAnyErrorOnCorrectDimension() {
        DimensionsMockUtils.getValidDimensions();
    }

}
