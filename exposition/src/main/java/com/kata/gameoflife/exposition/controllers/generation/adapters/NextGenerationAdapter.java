package com.kata.gameoflife.exposition.controllers.generation.adapters;

import com.kata.gameoflife.domain.generation.GameOfLifeGeneration;
import com.kata.gameoflife.exposition.controllers.generation.dtos.exit.NextGenerationDto;
import com.kata.gameoflife.exposition.structures.ExpositionAdapter;
import org.springframework.stereotype.Component;

@Component
public class NextGenerationAdapter implements ExpositionAdapter<GameOfLifeGeneration, NextGenerationDto> {

    @Override
    public NextGenerationDto adapt(GameOfLifeGeneration source) {
        return null;
    }
}