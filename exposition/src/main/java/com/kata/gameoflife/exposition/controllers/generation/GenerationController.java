package com.kata.gameoflife.exposition.controllers.generation;


import com.kata.gameoflife.application.usecases.game.query.get_next_generation.GetNextGeneration;
import com.kata.gameoflife.exposition.controllers.generation.adapters.NextGenerationAdapter;
import com.kata.gameoflife.exposition.controllers.generation.dtos.entry.GetNextGenerationDto;
import com.kata.gameoflife.exposition.controllers.generation.dtos.exit.NextGenerationDto;
import io.jkratz.mediator.core.Mediator;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("generations")
@AllArgsConstructor
public class GenerationController {

    private final Mediator mediator;
    private final NextGenerationAdapter nextGenerationAdapter;

    @PostMapping(value = "/next")
    ResponseEntity<NextGenerationDto> getNextGeneration(@Valid @RequestBody GetNextGenerationDto generationDto) {
        return ResponseEntity.ok()
                .body(this.nextGenerationAdapter.adapt(
                        this.mediator.dispatch(new GetNextGeneration(
                                generationDto.getHeight(),
                                generationDto.getLength(),
                                generationDto.getCells())
                        ))
                );
    }
}
