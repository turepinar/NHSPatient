package stepDefinitions.nhsSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.NhsLoginPage;
import utils.DriverHelper;

public class NhsAddPAtientSteps {

    WebDriver driver = DriverHelper.getDriver();
    NhsLoginPage nhsLoginPage = new NhsLoginPage(driver);


    @When("user clicks to the Add Patient section")
    public void user_clicks_to_the_add_patient_section() {

    }

    @Then("user should be able to input to the fields")
    public void user_should_be_able_to_input_to_the_fields() {

    }
    @Then("user clicks on Add Patient button")
    public void user_clicks_on_add_patient_button() {

    }

    @Then("user should be able to see patient details in Dahsboard page Patient Waiting Table")
    public void user_should_be_able_to_see_patient_details_in_dahsboard_page_patient_waiting_table() {

    }

}
