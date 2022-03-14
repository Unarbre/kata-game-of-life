package com.kata.gameoflife.exposition.controllers.generation.adapters;

import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Status;
import com.kata.gameoflife.exposition.controllers.generation.dtos.exit.NextGenerationDto;
import com.kata.gameoflife.exposition.structures.ExpositionAdapter;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class NextGenerationAdapter implements ExpositionAdapter<Generation, NextGenerationDto> {

    @Override
    public NextGenerationDto adapt(Generation source) {
        return NextGenerationDto.builder()
                .height(source.getDimensions().getHeight())
                .length(source.getDimensions().getLength())
                .cells(Arrays.stream(source.getCells()).map(line ->
                        Arrays.stream(line).map(cell ->
                                cell.getStatus().equals(Status.ALIVE)
                                        ? "x"
                                        : "."
                        ).toArray(String[]::new)
                ).toArray(String[][]::new))
                .build();
    }
}
