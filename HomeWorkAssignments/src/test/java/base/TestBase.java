package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.RegistrationForm;
import utilities.ConfigurationReader;
import utilities.Driver;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homePage;
    protected RegistrationForm registrationForm;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        wait = new WebDriverWait(driver, 10);
        homePage = new HomePage();
        registrationForm = new RegistrationForm();

    }

    @AfterMethod
    public void tearDown(){
        Driver.close();
    }
}
