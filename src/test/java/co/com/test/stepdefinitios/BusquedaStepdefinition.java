package co.com.test.stepdefinitios;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class BusquedaStepdefinition {

    @Before
    public void prepararescenario(){
        setTheStage(new OnlineCast());
    }
    @Given("The user is on the google")
    public void theUserIsOnTheGoogle() {

    }
    @When("The user search the {string}")
    public void theUserSearchThe(String string) {

    }
    @When("The user books a flight")
    public void theUserBooksAFlight() {

    }
    @Then("Flight reservation is confirmed")
    public void flightReservationIsConfirmed() {

    }

}
