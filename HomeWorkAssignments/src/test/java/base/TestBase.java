package base;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homePage;
    protected RegistrationForm registrationForm;
    protected Faker faker;
    protected FakeMailPage fakeMailPage;
    protected SignUpForMailListingPage signUpForMailListingPage;
    protected FileUploaderPage fileUploaderPage;
    protected AutocompletePage autocompletePage;
    protected StatusCodesPage statusCodesPage;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        faker = new Faker();
        homePage = new HomePage();
        registrationForm = new RegistrationForm();
        fakeMailPage = new FakeMailPage();
        signUpForMailListingPage = new SignUpForMailListingPage();
        fileUploaderPage = new FileUploaderPage();
        autocompletePage = new AutocompletePage();
        statusCodesPage = new StatusCodesPage();

    }

    @AfterMethod
    public void tearDown(){
        Driver.close();
    }
}