package com.kata.gameoflife.domain.generation.services;


import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Cell;
import com.kata.gameoflife.domain.generation.cell.Coordinates;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GenerationDomainService {

    private static GenerationDomainService instance;

    private GenerationDomainService() {
    }

    static public GenerationDomainService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GenerationDomainService();
        }

        return instance;
    }


    public Generation getNextGeneration(Generation generation) {
        var nextGenerationCells = Arrays.stream(generation.getCells()).map(lines ->
                Arrays.stream(lines).map(cell ->
                        Cell.builder()
                                .coordinates(cell.getCoordinates())
                                .status(cell.getNextStatus(
                                                this.getCells(
                                                        this.getAllNeighbors(cell), generation.getCells()
                                                )
                                        )
                                )
                                .build()
                ).toArray(Cell[]::new)
        ).toArray(Cell[][]::new);


        return Generation.builder()
                .dimensions(generation.getDimensions())
                .cells(nextGenerationCells)
                .build();
    }

    private Cell[] getCells(List<Coordinates> neighborsCoordinates, Cell[][] cells) {
        return neighborsCoordinates.stream()
                .filter(coordinates -> this.isInBound(coordinates, cells))
                .map(coordinates -> cells[coordinates.getY()][coordinates.getX()])
                .toArray(Cell[]::new);
    }

    private boolean isInBound(Coordinates coordinates, Cell[][] cells) {
        return  coordinates.getY() >= 0 && coordinates.getY() < cells.length &&
                coordinates.getX() >= 0 && coordinates.getX() < cells[coordinates.getY()].length;
    }

    private List<Coordinates> getAllNeighbors(Cell cell) {
        return List.of(
                Coordinates.getBuilder().x(cell.getCoordinates().getX() - 1).y(cell.getCoordinates().getY() - 1).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX() - 1).y(cell.getCoordinates().getY()).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX() - 1).y(cell.getCoordinates().getY() + 1).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX()).y(cell.getCoordinates().getY() - 1).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX()).y(cell.getCoordinates().getY() + 1).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX() + 1).y(cell.getCoordinates().getY() - 1).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX() + 1).y(cell.getCoordinates().getY()).build(),
                Coordinates.getBuilder().x(cell.getCoordinates().getX() + 1).y(cell.getCoordinates().getY() + 1).build()
        );
    }
}
