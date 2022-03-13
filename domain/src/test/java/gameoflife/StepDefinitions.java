package gameoflife;


import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Liveness;
import com.kata.gameoflife.domain.generation.services.GenerationDomainService;
import gameoflife.utils.CucumberGenerationUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefinitions {

    private final GenerationDomainService generationDomainService = GenerationDomainService.getInstance();
    private Generation generation;
    private Generation nextGeneration;

    @Given("the following setup")
    public void the_following_setup(io.cucumber.datatable.DataTable dataTable) {
        this.generation = CucumberGenerationUtils.dataTableToGeneration(dataTable);
    }

    @When("The next game tick occures")
    public void the_next_game_tick_occures() {
        this.nextGeneration = this.generationDomainService.getNextGeneration(this.generation);
    }

    @Then("the center cell should be dead")
    public void the_center_cell_should_be_dead() {
        assertEquals(this.nextGeneration.getCells()[1][1].getLiveness(), Liveness.DEAD);
    }

    @Then("the center cell should be alive")
    public void the_center_cell_should_be_alive() {
        assertEquals(this.nextGeneration.getCells()[1][1].getLiveness(), Liveness.ALIVE);
    }

    @Then("B0 B1 AND B2 shall be alive")
    public void b0_b1_and_b2_shall_be_alive() {
        assertEquals(this.nextGeneration.getCells()[0][1].getLiveness(), Liveness.ALIVE);
        assertEquals(this.nextGeneration.getCells()[1][1].getLiveness(), Liveness.ALIVE);
        assertEquals(this.nextGeneration.getCells()[2][1].getLiveness(), Liveness.ALIVE);

    }



}
