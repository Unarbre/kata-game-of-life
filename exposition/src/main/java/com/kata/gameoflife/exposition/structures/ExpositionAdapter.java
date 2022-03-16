package com.kata.gameoflife.exposition.structures;

import com.kata.gameoflife.domain.structures.BuildingBlock;

public interface ExpositionAdapter<From extends BuildingBlock, To extends Dto> {
    To adapt(From source);
}
