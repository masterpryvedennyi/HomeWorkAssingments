package tests;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TC8 extends TestBase {

    @Test
    public void test(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        homePage.autocomplete.click();
        autocompletePage.countryTextbox.sendKeys("United States of America");
        autocompletePage.submitButton.click();
        wait.until(ExpectedConditions.textToBePresentInElement(autocompletePage.result, "You selected: United States of America"));
        String actualResult = autocompletePage.result.getText();
        String expectedResult = "You selected: United States of America";
        assertEquals(actualResult, expectedResult);


    }
}
