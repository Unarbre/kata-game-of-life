package com.kata.gameoflife.exposition.controllers.generation.dtos.exit;

import com.kata.gameoflife.exposition.structures.Dto;
import lombok.Builder;


@Builder
public class NextGenerationDto implements Dto {
    Integer length;
    Integer height;
    CellDto[][] cells;
}
