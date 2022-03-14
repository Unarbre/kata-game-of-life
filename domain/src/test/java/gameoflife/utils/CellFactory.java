package gameoflife.utils;

import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Coordinates;

public class CellFactory {

    static Cell fromCoordinatesAndRawString(final int x, final int y, final String cellCharacter) {
        return Cell.getBuilder()
                .coordinates(Coordinates.getBuilder()
                        .x(x)
                        .y(y)
                        .build())
                .status(CellStatusFactory.get(cellCharacter))
                .build();
    }
}
