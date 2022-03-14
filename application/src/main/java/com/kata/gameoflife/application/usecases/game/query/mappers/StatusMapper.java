package com.kata.gameoflife.application.usecases.game.query.mappers;

import com.kata.gameoflife.application.structures.ApplicationException;
import com.kata.gameoflife.application.structures.Mapper;
import com.kata.gameoflife.domain.generation.cell.Status;
import org.springframework.stereotype.Component;

@Component
public class StatusMapper implements Mapper<String, Status> {
    @Override
    public Status map(String source) {

        switch(source) {
            case ".":
                return Status.DEAD;
            case "x":
                return Status.ALIVE;
            default:
                throw new ApplicationException(source + " is not a valid value as a cell status representation.");
        }


    }
}
