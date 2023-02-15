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

    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(driver);

    @Given("user navigates to the {string}")
    public void user_navigates_to_the(String epectedUrl) {
       driver.navigate().to(epectedUrl);
    }

    @When("enter the correct cridentials")
    public void enter_the_correct_cridentials() {
        nhsLoginPage.login("admin", "admin");
    }


    @Then("user should be in the main page of nhs patient")
    public void user_should_be_in_the_main_page_of_nhs_patient() {

        Assert.assertEquals("NHS patients", driver.getTitle());
    }


}
