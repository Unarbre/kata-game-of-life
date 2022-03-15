package com.kata.gameoflife.domain.generation;


import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.structures.Aggregate;
import com.kata.gameoflife.domain.structures.DomainException;

import java.util.Arrays;

public class Generation implements Aggregate {
    private final Dimensions dimensions;
    private final Cell[][] cells;

    Generation(Dimensions dimensions, Cell[][] cells) {
        this.dimensions = dimensions;
        this.cells = cells;
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public Cell[][] getCells() {
        return this.cells;
    }

    public String toString() {
        return "Generation(dimensions=" + this.getDimensions() + ", cells=" + java.util.Arrays.deepToString(this.getCells()) + ")";
    }

    public static GetGenerationBuilder getBuilder() {
        return new GetGenerationBuilder();
    }

    public static class GetGenerationBuilder {
        private Dimensions dimensions;
        private Cell[][] cells;

        GetGenerationBuilder() {
        }

        public GetGenerationBuilder dimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public GetGenerationBuilder cells(Cell[][] cells) {
            this.cells = cells;
            return this;
        }

        public Generation build() {
            return new Generation(dimensions, cells);
        }
    }

    public static CreateGenerationBuilder createBuilder() {
        return new CreateGenerationBuilder();
    }

    public static class CreateGenerationBuilder {
        private Dimensions dimensions;
        private Cell[][] cells;

        CreateGenerationBuilder() {
        }

        public CreateGenerationBuilder dimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public CreateGenerationBuilder cells(Cell[][] cells) {
            this.cells = cells;
            return this;
        }

        private boolean isCellSizeWellShaped(Cell[][] cells) {
            return cells.length == this.dimensions.getHeight();
        }

        private boolean areCellsLinesWellShaped(Cell[][] cells) {
            return Arrays.stream(cells).allMatch(line -> line.length == this.dimensions.getLength());
        }

        private void areCellsValid() {
            if (!this.isCellSizeWellShaped(cells)) {
                throw new DomainException("Cells height of the generation shall be of the height : " + this.dimensions.getHeight());
            }
            if (!this.areCellsLinesWellShaped(cells)) {
                throw new DomainException("All lines of the generation shall be of the size : " + this.dimensions.getLength());
            }
        }

        public Generation build() {
            if (cells == null) {
                throw new DomainException("Cells cannot be null");
            }

            if (dimensions == null) {
                throw new DomainException("Dimensions cannot be null");
            }

            this.areCellsValid();

            return new Generation(dimensions, cells);
        }
    }

}



