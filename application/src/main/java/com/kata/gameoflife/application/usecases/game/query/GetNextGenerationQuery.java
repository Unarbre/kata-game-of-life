package com.kata.gameoflife.application.usecases.game.query;

import com.kata.gameoflife.domain.generation.GameOfLifeGeneration;
import io.jkratz.mediator.core.Request;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
public class GetNextGenerationQuery implements Request<GameOfLifeGeneration> {
}
