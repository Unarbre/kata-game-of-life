package com.kata.gameoflife.domain.generation;

import com.kata.gameoflife.domain.generation.cell.Coordinates;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectCoordinateInformationException;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectHeightException;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectLengthException;
import com.kata.gameoflife.domain.generation.utils.CoordinatesMockUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CoordinatesTest {

    @Test
    public void shouldThrowErrorOnYStrictlyInferiorToZero() {
        try {
            Coordinates.createBuilder()
                    .x(-1)
                    .y(3)
                    .build();
            fail("Generation Creation should throw an error on y being strictly inferior to 0");
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectCoordinateInformationException);
        }
    }

    @Test
    public void shouldThrowErrorOnXStrictlyInferiorToZero() {
        try {
            Coordinates.createBuilder()
                    .x(3)
                    .y(-1)
                    .build();
            fail("Coordinates creation should throw an error on x being strictly inferior to 0");
        } catch (Exception exception) {
            assertTrue(exception instanceof IncorrectCoordinateInformationException);
        }
    }


    @Test
    public void shouldNotThrowAnyErrorOnCorrectCoordinates() {
        CoordinatesMockUtils.getValidCoordinates();
    }
}
