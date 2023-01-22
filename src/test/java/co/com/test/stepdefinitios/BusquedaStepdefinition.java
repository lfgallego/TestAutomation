package co.com.test.stepdefinitios;


import co.com.test.task.BuscarPagina;
import co.com.test.task.Opensite;
import co.com.test.task.ReservarVuelo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BusquedaStepdefinition {

    @Before
    public void prepararescenario() {
        setTheStage(new OnlineCast());
    }

    @Given("The user is on the google")
    public void theUserIsOnTheGoogle() {
        theActorCalled("actor").attemptsTo(Opensite.opensite());
    }

    @When("The user search the {string}")
    public void theUserSearchThe(String pagina) {
        theActorInTheSpotlight().attemptsTo(BuscarPagina.buscarPagina(pagina));
    }

    @When("The user books a flight")
    public void theUserBooksAFlight() {
        theActorInTheSpotlight().attemptsTo(ReservarVuelo.reservarVuelo());
    }

    @Then("Flight reservation is confirmed")
    public void flightReservationIsConfirmed() {

    }

}
