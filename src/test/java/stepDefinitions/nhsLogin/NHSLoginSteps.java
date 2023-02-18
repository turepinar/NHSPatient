package stepDefinitions.nhsLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import packages.NHSLoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class NHSLoginSteps {

    Hook hook = new Hook();
    WebDriver driver = hook.driver;
    //WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(hook.driver);

    @Given("user navigates to the {string}")
    public void user_navigates_to_the(String epectedUrl) {
        driver.navigate().to(epectedUrl);
    }

    @When("enter the cridentials username {string} and {string}")
    public void enter_the_cridentials_username_and(String user, String pass) {
        nhsLoginPage.login(user, pass);
    }

    @Then("user should be in the main page of nhs patient")
    public void user_should_be_in_the_main_page_of_nhs_patient() {
            Assert.assertEquals("NHS patients", driver.getTitle());
        }


    @Then("user should stay in the Login Page")
    public void user_should_stay_in_the_login_page() {
            Assert.assertEquals("LoginPage", driver.getTitle());
    }


    @Then("user should get error message as {string}")
    public void user_should_get_error_message_as(String errorMessage) {
        Assert.assertEquals(errorMessage, "fill this field out");
    }


}



