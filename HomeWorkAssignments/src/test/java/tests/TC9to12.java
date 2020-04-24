package tests;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC9to12 extends TestBase {
    private static String url = "https://practice-cybertekschool.herokuapp.com/";

    @Test(dataProvider = "verification messages")
    public void TC9(String link, String expectedMessage){
        driver.get(url);
        homePage.statusCodes.click();
        driver.findElement(By.linkText(link)).click();
        String actualMessage = statusCodesPage.message.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));

    }

    @DataProvider(name = "verification messages")
        public Object[][] getData(){
        return new Object[][]{
                {"200", "This page returned a 200 status code"},
                {"301", "This page returned a 301 status code"},
                {"404", "This page returned a 404 status code"},
                {"500", "This page returned a 500 status code"}
        };
        }
         }