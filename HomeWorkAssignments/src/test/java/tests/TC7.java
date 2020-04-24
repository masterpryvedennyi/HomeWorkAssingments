package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TC7 extends TestBase {

    @Test
    public void test(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        homePage.fileUpload.click();
        fileUploaderPage.chooseFile.sendKeys("/Users/pryvedennyi/Desktop/my_file.txt");
        fileUploaderPage.uploadButton.click();
        String actualSubject = fileUploaderPage.subject.getText();
        String expectedSubject = "File Uploaded!";
        assertEquals(actualSubject, expectedSubject);
        String actualFile = "my_file.txt";
        String expectedFile = fileUploaderPage.uploadedFile.getText();
        assertEquals(actualFile, expectedFile);
    }
}
/*
String url = ConfigurationReader.getProperty("url");
        driver.get(url);

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/pryvedennyi/Desktop/my_file.txt");

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(uploadedFile.getText(), "my_file.txt");

 */