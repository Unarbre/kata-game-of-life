package com.kata.gameoflife.domain.generation.cell;


import com.kata.gameoflife.domain.generation.cell.cellStatusStrategy.CellStatusStrategyFactory;
import com.kata.gameoflife.domain.generation.exceptions.NullPropertyException;
import com.kata.gameoflife.domain.structures.ValueObject;

public class Cell implements ValueObject {
    private final Coordinates coordinates;
    private final Status status;

    Cell(Coordinates coordinates, Status status) {
        this.coordinates = coordinates;
        this.status = status;
    }


    public Status getNextStatus(Cell[] neighbors) {
        return CellStatusStrategyFactory.get(this.status).getNextStatus(neighbors);
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public Status getStatus() {
        return this.status;
    }


    public String toString() {
        return "Cell(coordinates=" + this.getCoordinates() + ", status=" + this.getStatus();
    }

    public static GetCellBuilder getBuilder() {
        return new GetCellBuilder();
    }

    public static class GetCellBuilder {
        private Coordinates coordinates;
        private Status status;

        GetCellBuilder() {
        }

        public GetCellBuilder coordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public GetCellBuilder status(Status status) {
            this.status = status;
            return this;
        }

        public Cell build() {
            return new Cell(coordinates, status);
        }
    }

    public static CreateCellBuilder createBuilder() {
        return new CreateCellBuilder();
    }

    public static class CreateCellBuilder {
        private Coordinates coordinates;
        private Status status;

        CreateCellBuilder() {
        }

        public CreateCellBuilder coordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public CreateCellBuilder status(Status status) {
            this.status = status;
            return this;
        }

        public Cell build() {
            if (coordinates == null) {
                throw new NullPropertyException("Coordinates cannot be set as null");
            }

            if (status == null) {
                throw new NullPropertyException("Status cannot be set as null");
            }

            return new Cell(coordinates, status);
        }
    }
}
