package packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSLoginPage {

    public NHSLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "inputEmail")
    private WebElement username;

    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class, 'block btn-signin')]")
    private WebElement loginButton;


    public void login(String Username, String Password){
        this.username.sendKeys(Username);
        this.password.sendKeys(Password);
        loginButton.click();
    }


}
