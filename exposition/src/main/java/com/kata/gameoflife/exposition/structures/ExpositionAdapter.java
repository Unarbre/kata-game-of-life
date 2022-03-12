package com.kata.gameoflife.exposition.structures;

import com.kata.gameoflife.domain.structures.Aggregate;

public interface ExpositionAdapter<From extends Aggregate, To extends Dto> {
    To adapt(From source);
}
