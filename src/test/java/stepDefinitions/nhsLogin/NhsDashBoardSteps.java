package stepDefinitions.nhsLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.NHSLoginPage;
import pages.NhsDashboardPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class NhsDashBoardSteps {


    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(driver);
    NhsDashboardPage nhsDashboardPage = new NhsDashboardPage(driver);


    @When("logges in to website")
    public void logges_in_to_website() {
        nhsLoginPage.login(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));

    }
    @Then("should be able to see number of patient with room")
    public void should_be_able_to_see_number_of_patient() {
        Assert.assertEquals(nhsDashboardPage.ValidatePatientWithRooms() , "true");
    }

    @Then("should be able to see title of {string}")
    public void should_be_able_to_see_title_of(String patientWithRoomsTitle) {
        Assert.assertEquals(nhsDashboardPage.ValidateFullRooms(), "Patients with rooms");
    }

    @Then("should be able to see hospital icon in the Orange section")
    public void should_be_able_to_see_hospital_icon_in_the_orange_section() {
        Assert.assertEquals(nhsDashboardPage.ValidateHospitalIcon(), "true");

    }
}
