package tests;

import base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigurationReader;


import javax.xml.crypto.Data;
import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TC1to5 extends TestBase {

    @Test
    public void TC1(){
        driver.get(ConfigurationReader.getProperty("url_practice"));
        homePage.registrationForm.click();
        registrationForm.dateOfBirthForm.sendKeys("wrong_dob");
        assertTrue(registrationForm.dobErrorMessage.isDisplayed());
    }

    @Test
    public void TC2(){
        driver.get(ConfigurationReader.getProperty("url_practice"));
        homePage.registrationForm.click();
        assertEquals(registrationForm.cCheckBox.getText().toLowerCase(), "c++");
        assertEquals(registrationForm.javaCheckBox.getText().toLowerCase(), "java");
        assertEquals(registrationForm.javaScriptCheckBox.getText().toLowerCase(), "javascript");
    }

    @Test
    public void TC3(){
        driver.get(ConfigurationReader.getProperty("url_practice"));
        homePage.registrationForm.click();
        registrationForm.firstName.sendKeys("f");
        assertTrue(registrationForm.firstNameErrorMessage.isDisplayed());
    }

    @Test
    public void TC4(){
        driver.get(ConfigurationReader.getProperty("url_practice"));
        homePage.registrationForm.click();
        registrationForm.lastName.sendKeys("f");
        assertTrue(registrationForm.lastNameErrorMessage.isDisplayed());
    }

    @Test
    public void TC5(){
        driver.get(ConfigurationReader.getProperty("url_practice"));
        homePage.registrationForm.click();
        registrationForm.firstName.sendKeys("Max");
        registrationForm.lastName.sendKeys("Johnson");
        registrationForm.username.sendKeys("maxusername");
        registrationForm.email.sendKeys("max@gmail.com");
        registrationForm.password.sendKeys("password");
        registrationForm.phone.sendKeys("510-154-6590");
        registrationForm.maleRadioButton.click();
        registrationForm.birthday.sendKeys(getRandomDOB());
        Select department = new Select(registrationForm.departmentDropdown);

        department.selectByValue("DE");
        Select jobTitle = new Select(registrationForm.jobTitleDropdown);
        jobTitle.selectByVisibleText("SDET");
        registrationForm.javaCheckBox.click();
        registrationForm.signUpButton.click();
        assertEquals(registrationForm.confirmationMessage.getText(), "You've successfully completed registration!");






    }
    public String getRandomDOB(){
        Date years = faker.date().birthday(18, 65);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
        String strDate = formatter.format(years).toString();
        return strDate;
    }
}