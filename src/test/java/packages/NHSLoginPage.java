package packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSLoginPage {

    public NHSLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }




}
