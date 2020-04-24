package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FileUploaderPage {

    public FileUploaderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "file-upload")
    public WebElement chooseFile;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(tagName = "h3")
    public WebElement subject;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFile;

}
