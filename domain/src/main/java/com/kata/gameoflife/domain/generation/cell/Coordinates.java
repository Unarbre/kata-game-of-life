package com.kata.gameoflife.domain.generation.cell;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Coordinates {
    int x;
    int y;
}
