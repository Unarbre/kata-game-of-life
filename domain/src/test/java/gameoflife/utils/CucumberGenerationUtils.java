package gameoflife.utils;

import com.kata.gameoflife.domain.generation.Dimensions;
import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Cell;
import io.cucumber.datatable.DataTable;

import java.util.concurrent.atomic.AtomicInteger;

public class CucumberGenerationUtils {
    public static Generation dataTableToGeneration(DataTable dataTable) {
        final AtomicInteger xIndex = new AtomicInteger(0);
        final AtomicInteger yIndex = new AtomicInteger(0);

        return Generation.builder()
                .cells(dataTable
                        .cells().stream()
                        .map((line) -> {
                                    Cell[] cells = line.stream().map(cellAsCharacter -> CellFactory.fromCoordinatesAndRawString(
                                            xIndex.getAndIncrement(),
                                            yIndex.get(),
                                            cellAsCharacter
                                    )).toArray(Cell[]::new);

                                    yIndex.set(yIndex.get() + 1);
                                    xIndex.set(0);
                                    return cells;
                                }
                        ).toArray(Cell[][]::new)
                )

                .dimensions(
                        Dimensions.builder()
                                .height(dataTable.height())
                                .length(dataTable.width())
                                .build()
                )
                .build();
    }
}
