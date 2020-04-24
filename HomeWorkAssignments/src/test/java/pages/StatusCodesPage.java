package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StatusCodesPage {

    public StatusCodesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "200")
    public WebElement link200;

    @FindBy(linkText = "301")
    public WebElement link301;

    @FindBy(linkText = "404")
    public WebElement link404;

    @FindBy(linkText = "500")
    public WebElement link500;

    @FindBy(xpath = "//p")
    public WebElement message;
}
