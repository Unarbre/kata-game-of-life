package com.kata.gameoflife.domain.generation;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Dimensions {
    private Integer length;
    private Integer height;
}
