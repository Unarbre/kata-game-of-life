package com.kata.gameoflife.exposition.controllers.generation;


import com.kata.gameoflife.application.usecases.game.query.GetNextGenerationQuery;
import com.kata.gameoflife.exposition.controllers.generation.adapters.NextGenerationAdapter;
import com.kata.gameoflife.exposition.controllers.generation.dtos.exit.NextGenerationDto;
import io.jkratz.mediator.core.Mediator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generation")
@AllArgsConstructor
public class GenerationController {

    private final Mediator mediator;
    private final NextGenerationAdapter nextGenerationAdapter;

    @GetMapping("/next")
    NextGenerationDto getNextGeneration() {
        return this.nextGenerationAdapter.adapt(
                this.mediator.dispatch(new GetNextGenerationQuery()
                ));
    }
}
