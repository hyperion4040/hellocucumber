package hellocucumber.stepdefs;

import cucumber.api.java8.En;
import org.junit.Assert;

class AbsoluteValue{
    static int absoluteValue(int value)
    {
        return Math.abs(value);
    }
        }


public class MyStepdefs implements En {
    private int testValue;
    private int returnValue;
    public MyStepdefs() {
        Given("^entered value$", () -> {
            this.testValue = 2;
            // Write code here that turns the phrase above into concrete actions

        });
        When("^value is positive$", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.returnValue = AbsoluteValue.absoluteValue(testValue);
        });
        Then("^returned values is positive$", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(2,returnValue);
        });
        When("^value is negative$", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.returnValue = AbsoluteValue.absoluteValue(-testValue);

        });
    }
}
