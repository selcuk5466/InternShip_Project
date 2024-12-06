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
        }

        return null;
    }


}

