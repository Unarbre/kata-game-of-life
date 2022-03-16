package com.kata.gameoflife.domain.generation;


import com.kata.gameoflife.domain.generation.exceptions.IncorrectHeightException;
import com.kata.gameoflife.domain.generation.exceptions.IncorrectLengthException;
import com.kata.gameoflife.domain.structures.ValueObject;

public class Dimensions implements ValueObject {
    private final Integer length;
    private final Integer height;

    Dimensions(Integer length, Integer height) {
        this.length = length;
        this.height = height;
    }

    public Integer getLength() {
        return this.length;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String toString() {
        return "Dimensions(length=" + this.getLength() + ", height=" + this.getHeight() + ")";
    }


    public static GetDimensionsBuilder getBuilder() {
        return new GetDimensionsBuilder();
    }

    public static class GetDimensionsBuilder {
        private int length;
        private int height;

        GetDimensionsBuilder() {
        }

        public GetDimensionsBuilder length(int length) {
            this.length = length;
            return this;
        }

        public GetDimensionsBuilder height(int height) {
            this.height = height;
            return this;
        }

        public Dimensions build() {
            return new Dimensions(length, height);
        }
    }

    public static CreateDimensionBuilder createBuilder() {
        return new CreateDimensionBuilder();
    }

    public static class CreateDimensionBuilder {
        private int length;
        private int height;

        CreateDimensionBuilder () {}

        public CreateDimensionBuilder length(int length) {

            if (length <= 0) {
                throw new IncorrectHeightException("Length has to be a superior to 0");
            }
            this.length = length;
            return this;
        }

        public CreateDimensionBuilder height(int height) {
            if (height <= 0) {
                throw new IncorrectLengthException("Height has to be a superior to 0");
            }
            this.height = height;
            return this;
        }

        public Dimensions build() {

            return new Dimensions(length, height);
        }

    }
}
