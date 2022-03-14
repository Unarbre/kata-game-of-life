package com.kata.gameoflife.domain.generation;


import com.kata.gameoflife.domain.structures.DomainException;

public class Dimensions {
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
        private Integer length;
        private Integer height;

        GetDimensionsBuilder() {
        }

        public GetDimensionsBuilder length(Integer length) {
            this.length = length;
            return this;
        }

        public GetDimensionsBuilder height(Integer height) {
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
        private Integer length;
        private Integer height;

        CreateDimensionBuilder () {}

        public CreateDimensionBuilder length(Integer length) {

            if (length <= 0) {
                throw new DomainException("Length has to be a superior to 0");
            }
            this.length = length;
            return this;
        }

        public CreateDimensionBuilder height(Integer height) {
            if (height <= 0) {
                throw new DomainException("Height has to be a superior to 0");
            }
            this.height = height;
            return this;
        }

        public Dimensions build() {
            return new Dimensions(length, height);
        }

    }
}
