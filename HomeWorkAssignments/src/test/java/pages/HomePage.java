package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Registration Form")
    public WebElement registrationForm;

    @FindBy(linkText = "Sign Up For Mailing List")
    public WebElement mailListing;

    @FindBy(linkText = "File Upload")
    public WebElement fileUpload;

    @FindBy(linkText = "Autocomplete")
    public WebElement autocomplete;

    @FindBy(linkText = "Status Codes")
    public WebElement statusCodes;

}