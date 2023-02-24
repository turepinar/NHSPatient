package stepDefinitions.nhsSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.NhsDashBoardPage;
import pages.NhsLoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.ArrayList;
import java.util.List;

public class NhsDashboardSteps {

    List<String > expectedMessages = new ArrayList<>();
    WebDriver driver = DriverHelper.getDriver();
    NhsDashBoardPage nhsDashBoardPage = new NhsDashBoardPage(driver);
    NhsLoginPage nhsLoginPage = new NhsLoginPage(driver);

    @Given("Admin user navigates to NHS website {string}")
    public void admin_user_navigates_to_nhs_website(String URL) {
        driver.navigate().to(URL);
    }

    @When("The correct username and password is entered")
    public void the_correct_username_and_password_is_entered() {
        nhsLoginPage.login(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }


    @Then("User should see the titles as listed in data table")
    public void user_should_see_the_titles_as_listed_in_data_table(DataTable dataTable) {
        List<String> allMessages = dataTable.asList();
        expectedMessages.addAll(allMessages);
//        expectedMessages.add(allMessages.get(0));
//        expectedMessages.add(allMessages.get(1));
//        expectedMessages.add(allMessages.get(2));
    }

    @Then("validate all titles are correct")
    public void validate_all_titles_are_correct() {
      Assert.assertEquals(expectedMessages,nhsDashBoardPage.getCardsDisplayedMessage());
    }


}
