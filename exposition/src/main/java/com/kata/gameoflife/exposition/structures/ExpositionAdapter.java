package com.kata.gameoflife.exposition.structures;

import com.kata.gameoflife.domain.structures.Entity;

public interface ExpositionAdapter<From extends Entity, To extends Dto> {
    To adapt(From source);
}
