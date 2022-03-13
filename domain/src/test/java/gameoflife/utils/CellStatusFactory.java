package gameoflife.utils;

import com.kata.gameoflife.domain.generation.cell.Status;
import io.cucumber.core.exception.CucumberException;

public class CellStatusFactory {

    static Status get(String status) {
        switch(status) {
            case ".":
                return Status.DEAD;
            case "x":
                return Status.ALIVE;
            default:
                throw new CucumberException(String.format("Cell status information is wrong. %s is not a correct status", status));
        }
    }
}
