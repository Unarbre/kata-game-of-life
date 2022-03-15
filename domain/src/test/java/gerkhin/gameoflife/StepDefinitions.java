package gerkhin.gameoflife;


import com.kata.gameoflife.domain.generation.Generation;
import com.kata.gameoflife.domain.generation.cell.Status;
import com.kata.gameoflife.domain.generation.services.GenerationDomainService;
import gerkhin.gameoflife.utils.CucumberGenerationUtils;
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
        assertEquals(this.nextGeneration.getCells()[1][1].getStatus(), Status.DEAD);
    }

    @Then("the center cell should be alive")
    public void the_center_cell_should_be_alive() {
        assertEquals(this.nextGeneration.getCells()[1][1].getStatus(), Status.ALIVE);
    }

    @Then("B0 AND B2 shall be dead")
    public void b0_and_b2_shall_be_dead() {
        assertEquals(this.nextGeneration.getCells()[1][0].getStatus(), Status.DEAD);
        assertEquals(this.nextGeneration.getCells()[1][2].getStatus(), Status.DEAD);
    }

    @Then("B1 shall be alive")
    public void b1_shall_be_alive() {
        assertEquals(this.nextGeneration.getCells()[1][1].getStatus(), Status.ALIVE);
    }



}
