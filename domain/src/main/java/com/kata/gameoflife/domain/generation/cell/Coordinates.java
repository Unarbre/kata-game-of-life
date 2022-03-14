package com.kata.gameoflife.domain.generation.cell;


import com.kata.gameoflife.domain.structures.DomainException;

public class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return "Coordinates(x=" + this.getX() + ", y=" + this.getY() + ")";
    }

    public static GetCoordinatesBuilder getBuilder() {
        return new GetCoordinatesBuilder();
    }
    public static class GetCoordinatesBuilder {
        private int x;
        private int y;

        GetCoordinatesBuilder() {
        }

        public GetCoordinatesBuilder x(int x) {
            this.x = x;
            return this;
        }

        public GetCoordinatesBuilder y(int y) {
            this.y = y;
            return this;
        }

        public Coordinates build() {
            return new Coordinates(x, y);
        }
    }


    public static CreateCoordinatesBuilder createBuilder() {
        return new CreateCoordinatesBuilder();
    }

    public static class CreateCoordinatesBuilder {
        private int x;
        private int y;

        CreateCoordinatesBuilder() {
        }

        public CreateCoordinatesBuilder x(int x) {

            if (x < 0) {
                throw new DomainException("X has to be a superior or equal to 0");
            }

            this.x = x;
            return this;
        }

        public CreateCoordinatesBuilder y(int y) {

            if (y < 0) {
                throw new DomainException("Y has to be a superior or equal to 0");
            }
            this.y = y;
            return this;
        }

        public Coordinates build() {
            return new Coordinates(x, y);
        }
    }
}
