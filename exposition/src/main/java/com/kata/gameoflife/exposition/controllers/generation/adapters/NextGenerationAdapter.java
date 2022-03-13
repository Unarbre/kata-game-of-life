package com.kata.gameoflife.exposition.controllers.generation.adapters;

import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.exposition.controllers.generation.dtos.exit.NextGenerationDto;
import com.kata.gameoflife.exposition.structures.ExpositionAdapter;
import org.springframework.stereotype.Component;

@Component
public class NextGenerationAdapter implements ExpositionAdapter<Generation, NextGenerationDto> {

    @Override
    public NextGenerationDto adapt(Generation source) {
        return null;
    }
}
