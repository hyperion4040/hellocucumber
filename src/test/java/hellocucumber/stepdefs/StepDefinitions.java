package hellocucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.Actionwords;

public class StepDefinitions {
    private Actionwords actionwords = new Actionwords();

    @Given("^entered value$")
    public void enteredValue() {
        actionwords.enteredValue();
    }

    @When("^value is positive$")
    public void valueIsPositive() {
        actionwords.valueIsPositive();
    }

    @Then("^returned values is positive$")
    public void returnedValuesIsPositive() {
        actionwords.returnedValuesIsPositive();
    }

    @When("^value is negative$")
    public void valueIsNegative() {
        actionwords.valueIsNegative();
    }
}