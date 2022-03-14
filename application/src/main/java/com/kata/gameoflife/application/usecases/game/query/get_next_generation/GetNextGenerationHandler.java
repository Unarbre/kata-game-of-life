package com.kata.gameoflife.application.usecases.game.query.get_next_generation;

import com.kata.gameoflife.application.usecases.game.query.mappers.GenerationMapper;
import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.services.GenerationDomainService;
import io.jkratz.mediator.core.RequestHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetNextGenerationHandler implements RequestHandler<GetNextGeneration, Generation> {

    private final GenerationDomainService generationDomainService = GenerationDomainService.getInstance();
    private final GenerationMapper generationMapper;

    @Override
    public Generation handle(final GetNextGeneration getNextGeneration) {
        return this.generationDomainService.getNextGeneration(this.generationMapper.map(getNextGeneration));
    }
}
