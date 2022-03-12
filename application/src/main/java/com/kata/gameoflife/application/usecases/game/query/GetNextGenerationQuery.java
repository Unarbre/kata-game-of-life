package com.kata.gameoflife.application.usecases.game.query;

import com.kata.gameoflife.domain.generation.GameOfLifeGeneration;
import io.jkratz.mediator.core.Request;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetNextGenerationQuery implements Request<GameOfLifeGeneration> {
}
