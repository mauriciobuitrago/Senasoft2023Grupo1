package co.com.senasoft2023.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class registerStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user is on the web page$")
    public void userIsOnTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));

    }

    @When("^user enter the credentials$")
    public void userEnterTheCredentials() {

    }

    @Then("^user could see your name$")
    public void userCouldSeeYourName() {

    }

    @When("^user doesn't enter all credentials$")
    public void userDoesnTEnterAllCredentials() {

    }

    @Then("^user will not be able to log in$")
    public void userWillNotBeAbleToLogIn() {

    }

}
