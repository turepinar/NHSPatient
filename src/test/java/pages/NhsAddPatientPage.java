package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsAddPatientPage {

    public NhsAddPatientPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href = '/app/addpatient']")
    private WebElement AddPAtientSection;

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;

    @FindBy(name = "hospitalNumber")
    private WebElement hospitalNumberField;

    @FindBy(name = "dateOfBirth")
    private WebElement DOBField;




}
