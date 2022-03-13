package com.kata.gameoflife.domain.generation.cell;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Coordinates {
    Integer x;
    Integer y;
}
