package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsLoginPage {

    public NhsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "inputEmail")
    private WebElement username;

    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class, 'block btn-signin')]")
    private WebElement loginButton;



    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }


}
