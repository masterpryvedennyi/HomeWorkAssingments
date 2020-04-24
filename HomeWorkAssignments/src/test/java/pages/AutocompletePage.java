package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutocompletePage {
    public AutocompletePage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "myCountry")
    public WebElement countryTextbox;

    @FindBy(xpath = "//p[@id='result']")
    public WebElement result;

    @FindBy(xpath = "//*[@value='Submit']")
    public WebElement submitButton;
}
