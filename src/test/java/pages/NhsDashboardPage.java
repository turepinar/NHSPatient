package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsDashboardPage {

    public NhsDashboardPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="patients-with-rooms-live")
    private WebElement patientAmount;

    @FindBy(xpath = "//div[@id= 'patients-with-rooms-live']/following-sibling::div")
    private WebElement roomsTitle;

    @FindBy(xpath = "//div[@class='col-xs-3']")
    private WebElement hospitalIcon;


    public String ValidatePatientWithRooms(){
       String result1= Boolean.toString(patientAmount.isDisplayed());
        return result1;
    }

    public String ValidateFullRooms(){
        return roomsTitle.getText();
    }

    public String ValidateHospitalIcon(){
        String result2 = Boolean.toString(hospitalIcon.isDisplayed());
        System.out.println(result2);
        return result2;
    }


}
