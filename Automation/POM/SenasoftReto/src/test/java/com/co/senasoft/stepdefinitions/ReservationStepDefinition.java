package com.co.senasoft.stepdefinitions;

import com.co.senasoft.steps.ReservationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReservationStepDefinition {

    @Steps
    ReservationStep reservationStep;

    @Given("user is on the web page")
    public void userIsOnTheWebPage() {
        reservationStep.openStaysPage();
    }
    @Given("user enter the information")
    public void userEnterTheInformation() {

    }
    @When("user enter the filers")
    public void userEnterTheFilers() {

    }
    @Then("user should see the most economical hotel")
    public void userShouldSeeTheMostEconomicalHotel() {

    }
    @Given("user doesn't enter the information correctly")
    public void userDoesnTEnterTheInformationCorrectly() {

    }
    @Then("user should see an alert")
    public void userShouldSeeAnAlert() {

    }
}
