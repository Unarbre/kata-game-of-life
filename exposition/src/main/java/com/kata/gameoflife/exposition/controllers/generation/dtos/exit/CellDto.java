package com.kata.gameoflife.exposition.controllers.generation.dtos.exit;

import com.kata.gameoflife.exposition.structures.Dto;
import lombok.Builder;


@Builder
public class CellDto implements Dto {
    boolean alive;

}
