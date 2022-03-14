package com.kata.gameoflife.domain.generation.cell;

import com.kata.gameoflife.domain.structures.Entity;
import lombok.ToString;

@ToString
public enum Status implements Entity {
    ALIVE,
    DEAD,
}
