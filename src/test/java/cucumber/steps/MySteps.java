package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


/**
 * @author Thanh Le
 */
public class MySteps extends BaseStep {

    @Given("^I open website (.*)$")
    public void openSite(String site)  {
        // Write code here that turns the phrase above into concrete actions
        driver.get(site);
    }

    @Then("^I see the title (.*)$")
    public void verifyTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(title, driver.getTitle());
    }
}