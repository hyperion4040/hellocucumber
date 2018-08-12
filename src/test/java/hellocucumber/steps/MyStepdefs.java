package hellocucumber.steps;

import cucumber.api.java8.En;

import static junit.framework.TestCase.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

public class MyStepdefs implements En {

    private String today;
    private String actualAnswer;

    public MyStepdefs() {


        Given("^today is Sunday$", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = "Sunday";

        });
        When("^I ask whether it is Friday yet$", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.actualAnswer = IsItFriday.isItFriday(today);

        });
        Then("^I should be told \"([^\"]*)\"$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            assertEquals(arg0,actualAnswer);

        });
    }
}
