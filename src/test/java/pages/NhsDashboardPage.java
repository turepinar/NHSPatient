package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class NhsDashboardPage {

    public NhsDashboardPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="patients-with-rooms-live")
    private WebElement patientAmount;

    @FindBy(xpath = "//div[@id= 'patients-with-rooms-live']/following-sibling::div")
    private WebElement roomsTitle;

    @FindBy(className = "fa fa-hotel fa-5x")
    private WebElement patientIcon;

    @FindBy(className = "panel-heading")
    List<WebElement> cards;


    public String ValidatePatientWithRooms(){
       String result1= Boolean.toString(patientAmount.isDisplayed());
        System.out.println(result1);
        return result1;
    }

    public String ValidateFullRooms(){
        return roomsTitle.getText();
    }

    public String ValidateHospitalIcon(){
        String result2 = Boolean.toString(patientIcon.isDisplayed());
        System.out.println(result2);
        return result2;
    }

    //To validate card titles has matching with datatable in future file.
    public List<String> getCardsDisplayedMessage(){
        List<String> actualCardMessages = new ArrayList<>();
        for (WebElement card : cards){
            actualCardMessages.add(BrowserUtils.getTextMethod(card));
        }
        return actualCardMessages;
    }







}
