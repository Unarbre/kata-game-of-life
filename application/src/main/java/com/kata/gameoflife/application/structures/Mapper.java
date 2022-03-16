package com.kata.gameoflife.application.structures;

import com.kata.gameoflife.domain.structures.BuildingBlock;

public interface Mapper<From, To extends BuildingBlock>{

    To map(From source);
}
