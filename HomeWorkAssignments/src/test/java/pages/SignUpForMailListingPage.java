package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpForMailListingPage {

    public SignUpForMailListingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "full_name")
    public WebElement fullNameTextbox;

    @FindBy(name = "email")
    public WebElement emailTextbox;

    @FindBy(name = "wooden_spoon")
    public WebElement signUpButton;

    @FindBy(xpath = "//h3")
    public WebElement confirmationMessage;



}
