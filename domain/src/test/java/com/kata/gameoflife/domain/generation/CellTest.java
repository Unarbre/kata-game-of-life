package com.kata.gameoflife.domain.generation;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Status;
import com.kata.gameoflife.domain.generation.exceptions.NullPropertyException;
import com.kata.gameoflife.domain.generation.utils.CellMockUtils;
import com.kata.gameoflife.domain.generation.utils.CoordinatesMockUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CellTest {


    @Test
    void ShouldThrowErrorOnNullCoordinates() {
        try {
            Cell.createBuilder()
                    .coordinates(null)
                    .status(Status.ALIVE)
                    .build();
            fail( "Cell creation should throw an error on null coordinates." );
        } catch (Exception exception) {
            assertTrue(exception instanceof NullPropertyException);
        }
    }


    @Test
    void ShouldThrowErrorOnNullStatus() {
        try {
            Cell.createBuilder()
                    .coordinates(CoordinatesMockUtils.getValidCoordinates())
                    .status(null)
                    .build();
            fail( "Cell creation should throw an error on null status." );
        } catch (Exception exception) {
            assertTrue(exception instanceof NullPropertyException);
        }
    }

    @Test
    void ShouldNotThrowErrorOnCorrectCell() {
        CellMockUtils.getValidLivingCell(0, 0);
    }
}
