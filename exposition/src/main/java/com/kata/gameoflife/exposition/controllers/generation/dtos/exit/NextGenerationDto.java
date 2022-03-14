package com.kata.gameoflife.exposition.controllers.generation.dtos.exit;

import com.kata.gameoflife.exposition.structures.Dto;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class NextGenerationDto implements Dto {
    Integer length;
    Integer height;
    String[][] cells;
}
