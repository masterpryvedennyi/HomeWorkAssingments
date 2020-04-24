package tests;

import base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FakeMailPage;
import pages.HomePage;
import pages.RegistrationForm;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TC6 extends TestBase {

    @Test
    public void test() {
        driver.get("https://www.tempmailaddress.com/");
        wait.until(ExpectedConditions.visibilityOf(fakeMailPage.emailBox));
        String email = fakeMailPage.emailBox.getText();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        homePage.mailListing.click();
        String fullname = faker.name().fullName();
        wait.until(ExpectedConditions.visibilityOf(signUpForMailListingPage.fullNameTextbox));
        signUpForMailListingPage.fullNameTextbox.sendKeys(fullname);
        signUpForMailListingPage.emailTextbox.sendKeys(email);
        signUpForMailListingPage.signUpButton.click();
        String actualMessage = signUpForMailListingPage.confirmationMessage.getText();
        assertEquals(actualMessage, "Thank you for signing up. Click the button below to return to the home page.");
        driver.navigate().to("https://www.tempmailaddress.com/");
        driver.navigate().refresh();
        String expectedSender = "do-not-reply@practice.cybertekschool.com";
        //wait.until(ExpectedConditions.textToBePresentInElement(fakeMailPage.senderInbox, expectedSender));
        String actualSender = fakeMailPage.senderInboxMessage.getText().trim();
        assertEquals(actualSender, expectedSender);
        fakeMailPage.senderInbox.click();
        String actualSenderInbox = fakeMailPage.fromSender.getText();
        String expectedSubject = "Thanks for subscribing to practice.cybertekschool.com!";
        String actualSubject = fakeMailPage.subject.getText();
        assertEquals(actualSenderInbox, expectedSender);
        assertEquals(actualSubject, expectedSubject);

    }


}