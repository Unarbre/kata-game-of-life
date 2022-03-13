package com.kata.gameoflife.domain.generation;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Dimensions {
    private Integer length;
    private Integer height;
}
