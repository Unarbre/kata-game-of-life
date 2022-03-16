package com.kata.gameoflife.application.usecases.game.query.get_next_generation;

import com.kata.gameoflife.domain.generation.Generation;
import io.jkratz.mediator.core.Request;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetNextGeneration implements Request<Generation> {
    public final int height;
    public final int length;
    public final String[][] cells;
}
