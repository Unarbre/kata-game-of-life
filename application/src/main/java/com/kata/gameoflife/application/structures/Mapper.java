package com.kata.gameoflife.application.structures;

import com.kata.gameoflife.domain.structures.Entity;

public interface Mapper<From, To extends Entity>{

    To map(From source);
}
