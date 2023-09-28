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

public class loginStepdefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user is on the login page$")
    public void heUserIsOnTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://account.booking.com/sign-in?op_token=EgVvYXV0aCKKAwoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qqQJVc0FCdTI0ZTJXRmZDSXc4YkJHOEFWUl9MVHFZM0ZGMW5iX1EtcXd1czdRX0I2d0luakdCQS1WRDFlV2t3YzFFcFVORFJDYmZiMEhIbGJSdVdzQ3hWMG5adXV1SFZOWl91WmhwYy0zTG4tRHFvdWIzZ2pmYnQ4aFdaSi1MVVFaSzMwbktDWkZjdlRCNWxkbThkMFhDX0ZsRm5oT0QtckF6T01xWGtxNnI2Vnl0VWtQOWpjeTE5LUJkOGNoMDhoTVRmTzUtaENRREQtS1Q0enlaMmtKTExjMDZuVmFKYUpTMDhYMG5jWEJlRUZaTy1LNkx5Vm1PNjFtTmt0WlYwSm5Mak5xZipleUpwWkNJNkluUnlZWFpsYkd4bGNsOW9aV0ZrWlhJaWZRPT1CBGNvZGUqKQiaohgw9fmXiYXIJjoAQgBYra3WqAaSARB0cmF2ZWxsZXJfaGVhZGVy"));
    }


    @When("^he user insert valid credentials$")
    public void heUserInsertValidCredentials() {

    }

    @Then("^he could see his name in the home page$")
    public void heCouldSeeHisNameInTheHomePage() {
    }

}
