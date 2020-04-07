package tests;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TC_1To5 extends TestBase {

    @Test
    public void TC1(){
        homePage.registrationForm.click();
        registrationForm.dateOfBirthForm.sendKeys("wrong_dob");
        assertTrue(registrationForm.dobErrorMessage.isDisplayed());
    }

    @Test
    public void TC2(){
        homePage.registrationForm.click();
        assertEquals(registrationForm.cCheckBox.getText().toLowerCase(), "c++");
        assertEquals(registrationForm.javaCheckBox.getText().toLowerCase(), "java");
        assertEquals(registrationForm.javaScriptCheckBox.getText().toLowerCase(), "javascript");
    }

    @Test
    public void TC3(){
        homePage.registrationForm.click();
        registrationForm.firstName.sendKeys("f");
        assertTrue(registrationForm.firstNameErrorMessage.isDisplayed());
    }

    @Test
    public void TC4(){
        homePage.registrationForm.click();
        registrationForm.lastName.sendKeys("f");
        assertTrue(registrationForm.lastNameErrorMessage.isDisplayed());
    }

    @Test
    public void TC5(){
        homePage.registrationForm.click();
        registrationForm.firstName.sendKeys("Max");
        registrationForm.lastName.sendKeys("Johnson");
    }
}
