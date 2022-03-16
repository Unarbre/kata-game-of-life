package com.kata.gameoflife.domain.generation.cell;

import com.kata.gameoflife.domain.structures.BuildingBlock;
import com.kata.gameoflife.domain.structures.ValueObject;

public enum Status implements ValueObject {
    ALIVE,
    DEAD,
}
