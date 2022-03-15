package com.kata.gameoflife.domain.generation.utils;


import com.kata.gameoflife.domain.generation.Dimensions;

public class DimensionsMockUtils {


    public static Dimensions getValidDimensions() {
        return Dimensions.getBuilder()
                .length(2)
                .height(2)
                .build();
    }
}
