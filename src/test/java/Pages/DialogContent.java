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

    @FindBy(xpath = "(//SPAN[@_ngcontent-ng-c1010417632=''])[1]")
    public WebElement courses;

    @FindBy(xpath = "(//SPAN[@_ngcontent-ng-c1010417632=''])[3]")
    public WebElement calendar;

    @FindBy(xpath = "(//SPAN[@_ngcontent-ng-c1010417632=''])[5]")
    public WebElement attendance;

    @FindBy(xpath = "(//SPAN[@_ngcontent-ng-c1010417632=''])[7]")
    public WebElement assignments;

    @FindBy(xpath = "(//SPAN[@_ngcontent-ng-c1010417632=''])[9]")
    public WebElement grading;

    @FindBy(xpath = "//*[@data-icon='bars']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "(//SPAN[@class='mat-focus-indicator'])[7]")
    public WebElement chatMsg;

    @FindBy(xpath = "(//SPAN[@class='mat-focus-indicator'])[8]")
    public WebElement msg;

    @FindBy(xpath = "(//IMG[@_ngcontent-ng-c320871950=''])[1]")
    public WebElement profile;







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
            case "courses" : return this.courses;
            case "calendar" : return this.calendar;
            case "attendance" : return this.attendance;
            case "assignments" : return this.assignments;
            case "grading" : return this.grading;
            case "hamburgerMenu" : return this.hamburgerMenu;
            case "chatMsg" : return this.chatMsg;
            case "msg" : return this.msg;
            case "profile" : return this.profile;
        }

        return null;
    }


}

