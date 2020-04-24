package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FakeMailPage {

    public FakeMailPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='col-xs-12 col-md-6 tbg']//span")
    public WebElement emailBox;

    @FindBy(id = "odesilatel")
    public WebElement fromSender;

    @FindBy(id = "predmet")
    public WebElement subject;

    @FindBy(xpath = "//*[@id='schranka']/tr[1]/td/span[2]")
    public WebElement senderInbox;

    @FindBy(xpath = "//*[@id='schranka']/tr[1]/td")
    public WebElement senderInboxMessage;

}
