package com.kata.gameoflife.application.usecases.game.query.mappers;

import com.kata.gameoflife.application.structures.Mapper;
import com.kata.gameoflife.application.usecases.game.query.get_next_generation.GetNextGeneration;
import com.kata.gameoflife.domain.generation.Dimensions;
import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Coordinates;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@AllArgsConstructor
public class GenerationMapper implements Mapper<GetNextGeneration, Generation> {

    private final StatusMapper statusMapper;

    @Override
    public Generation map(GetNextGeneration source) {
        final AtomicInteger yIndex = new AtomicInteger(0);
        return Generation.builder()
                .dimensions(
                        Dimensions.createBuilder()
                                .length(source.length)
                                .height(source.height)
                                .build()
                )
                .cells(
                        Arrays.stream(source.cells).map(line ->
                                mapCellLines(yIndex.getAndIncrement(), line)
                        ).toArray(Cell[][]::new)
                )
                .build();
    }


    private Cell[] mapCellLines(int yIndex, String[] rawCellLine) {
        final AtomicInteger xIndex = new AtomicInteger(0);

        return Arrays.stream(rawCellLine).map(cell ->
                Cell.builder()
                        .coordinates(Coordinates.createBuilder()
                                .y(yIndex)
                                .x(xIndex.getAndIncrement())
                                .build())
                        .status(this.statusMapper.map(cell))
                        .build()

        ).toArray(Cell[]::new);
    }
}
