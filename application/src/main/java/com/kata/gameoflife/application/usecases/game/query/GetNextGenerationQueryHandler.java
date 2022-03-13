package com.kata.gameoflife.application.usecases.game.query;

import com.kata.gameoflife.domain.generation.Generation;
import io.jkratz.mediator.core.RequestHandler;
import org.springframework.stereotype.Component;

@Component
public class GetNextGenerationQueryHandler implements RequestHandler<GetNextGenerationQuery, Generation> {
    @Override
    public Generation handle(final GetNextGenerationQuery getNextGenerationQuery) {
        return Generation.builder()
                .build();
    }
}
