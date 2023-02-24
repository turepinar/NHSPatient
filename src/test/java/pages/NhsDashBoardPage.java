package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class NhsDashBoardPage {


    public NhsDashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class= 'col-xs-9 text-right']/child::div[2]")
    List<WebElement> cardTitles;

    public List<String> getCardsDisplayedMessage(){
        List<String> actualCardsMessages = new ArrayList<>();
        for(WebElement card:cardTitles){
            actualCardsMessages.add(BrowserUtils.getTextMethod(card));
        }
        return actualCardsMessages;
    }

}
