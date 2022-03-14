package com.kata.gameoflife.exposition.controllers.generation.dtos.entry;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GetNextGenerationDto {
    int length;
    int height;
    String[][] cells;
}
