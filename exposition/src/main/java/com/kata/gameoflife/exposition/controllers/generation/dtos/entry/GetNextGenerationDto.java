package com.kata.gameoflife.exposition.controllers.generation.dtos.entry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Getter
public class GetNextGenerationDto {

    int length;
    int height;

    @NotEmpty(message = "Please provide an array of array of cells.")
    String[][] cells;
}
