package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RegistrationForm {
    public RegistrationForm(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "birthday")
    public WebElement dateOfBirthForm;

    @FindBy(xpath = "//*[.='The date of birth is not valid']")
    public WebElement dobErrorMessage;

    @FindBy(css = "input#inlineCheckbox1~label")
    public WebElement cCheckBox;

    @FindBy(css = "input#inlineCheckbox2~label")
    public WebElement javaCheckBox;

    @FindBy(css = "input#inlineCheckbox3~label")
    public WebElement javaScriptCheckBox;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(xpath = "//*[.='first name must be more than 2 and less than 64 characters long']")
    public WebElement firstNameErrorMessage;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(xpath = "//*[.='The last name must be more than 2 and less than 64 characters long']")
    public WebElement lastNameErrorMessage;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "phone")
    public WebElement phone;

    @FindBy(xpath = "//input[@value='male']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@value='female']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='other']")
    public WebElement otherRadioButton;

    @FindBy(name = "birthday")
    public WebElement birthday;

    @FindBy(name = "department")
    public WebElement departmentDropdown;

    @FindBy(name = "job_title")
    public WebElement jobTitleDropdown;

    @FindBy(id = "wooden_spoon")
    public WebElement signUpButton;

    @FindBy(xpath = "//p")
    public WebElement confirmationMessage;

}

