package com.kata.gameoflife.application.usecases.game.query;

import com.kata.gameoflife.domain.generation.GameOfLifeGeneration;
import io.jkratz.mediator.core.RequestHandler;
import org.springframework.stereotype.Component;

@Component
public class GetNextGenerationQueryHandler implements RequestHandler<GetNextGenerationQuery, GameOfLifeGeneration> {
    @Override
    public GameOfLifeGeneration handle(final GetNextGenerationQuery getNextGenerationQuery) {
        return GameOfLifeGeneration.builder()
                .build();
    }
}
