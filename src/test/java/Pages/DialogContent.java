package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='logo-text ng-star-inserted']")
    public WebElement headText;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//div[@class=\"ng-star-inserted\"]/img")
    public WebElement logo;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamMenu;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[15]")
    public WebElement hamMessaging;

    @FindBy(linkText = "Send Message")
    public WebElement hamSendMessage;

    @FindBy(linkText = "Inbox")
    public WebElement hamInbox;

    @FindBy(linkText = "Outbox")
    public WebElement hamOutbox;

    @FindBy(linkText = "Trash")
    public WebElement hamTrash;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[6]")
    public WebElement openedPageName;

    @FindBy(xpath = "(//span[@class='mat-focus-indicator'])[17]")
    public WebElement addReceiver;

    @FindBy(id = "mat-mdc-form-field-label-22")
    public WebElement nameOrEmail;

    @FindBy(xpath = "//tbody[@role='rowgroup']/tr")
    public WebElement selectReceiver;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[13]")
    public WebElement addClose;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='title'])")
    public WebElement subject;

    @FindBy(xpath = "(//div[@class='tox-edit-area'])")
    public WebElement textInMessage;

    @FindBy(xpath = "sendButton")
    public WebElement sendButton;






    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "headText" : return this.headText;
            case "messageBox" : return this.messageBox;
            case "logo" : return this.logo;
            case "hamMenu":return this.hamMenu;
            case "hamMessaging":return  this.hamMessaging;
            case "hamSendMessage":return this.hamSendMessage;
            case "hamInbox":return this.hamInbox;
            case "hamOutbox":return this.hamOutbox;
            case "hamTrash": return this.hamTrash;
            case "openedPageName":return this.openedPageName;
            case "addReceiver":return this.addReceiver;
            case "nameOrEmail":return this.nameOrEmail;
            case "selectReceiver":return this.selectReceiver;
            case "addClose":return this.addClose;
            case "subject":return this.subject;
            case "textInMessage":return this.textInMessage;
            case "sendButton":return this.sendButton;



        }

        return null;
    }


}

