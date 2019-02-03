package cucumber.steps;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * @author Swapna Anne
 */

public class LoginSteps extends BaseStep {

    @Given("^user is already on Login Page(.*)$")
    public void user_already_on_login_page(String site) {
        driver.get(site);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);

    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password(DataTable credentials) {
        for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

            driver.findElement(By.name("username")).sendKeys(data.get("username"));
            driver.findElement(By.name("password")).sendKeys(data.get("password"));

            System.out.println(data.get("username"));
            System.out.println(data.get("password"));
        }

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//div[@class='input-group-btn']"));   //("input[@type='submit']"));
        loginBtn.click();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        //Assert.assertEquals("CRMPRO", title);
    }

    @Then("^user moves to new deal page$")
    public void user_moves_to_new_deals_page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
        driver.findElement(By.xpath("//a[@title='Deals']")).click();
    //"a[contains(text(),'Deals')]"
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        //driver.quit();
    }

}
