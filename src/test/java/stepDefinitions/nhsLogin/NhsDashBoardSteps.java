package stepDefinitions.nhsLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.NHSLoginPage;
import pages.NhsDashboardPage;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.ArrayList;
import java.util.List;

public class NhsDashBoardSteps {


    List<String> expectedMessages = new ArrayList<>();
    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(driver);
    NhsDashboardPage nhsDashboardPage = new NhsDashboardPage(driver);


    @Given("user navigates to the {string}")
    public void user_navigates_to_the(String expectedUrl){
        driver.navigate().to(expectedUrl);
    }

    @When("logges in to website")
    public void logges_in_to_website() {
        nhsLoginPage.login(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }

    @Then("should be able to see number of patient with room")
    public void should_be_able_to_see_number_of_patient() {
        Assert.assertEquals(nhsDashboardPage.ValidatePatientWithRooms(), "true");
    }

    @Then("should be able to see title of {string}")
    public void should_be_able_to_see_title_of(String patientWithRoomsTitle) {
        Assert.assertEquals(nhsDashboardPage.ValidateFullRooms(), "Patients with rooms");
    }

    @Then("should be able to see hospital icon in the blue section")
    public void should_be_able_to_see_hospital_icon_in_the_blue_section() {
        Assert.assertEquals(nhsDashboardPage.ValidateHospitalIcon(), "true");
    }


    @Then("The information cards show on the screen")
    public void the_information_cards_show_on_the_screen(io.cucumber.datatable.DataTable dataTable) {

        List<String> allMessages = dataTable.asList();

        expectedMessages.add(allMessages.get(0));
        expectedMessages.add(allMessages.get(1));
        expectedMessages.add(allMessages.get(2));
    }

    @Then("validate the message on each card")
    public void validate_the_message_on_each_card() {
        Assert.assertEquals(expectedMessages, nhsDashboardPage.getCardsDisplayedMessage());
    }


}
