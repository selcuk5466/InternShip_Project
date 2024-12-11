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

import javax.tools.Tool;
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

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[11]")
    public WebElement hamSendMessage;

    @FindBy(xpath = "(//button[@class='mat-mdc-menu-item mat-focus-indicator ng-tns-c3371495337-7 ng-star-inserted'])[2]")
    public WebElement hamInbox;

    @FindBy(xpath = "(//button[@class='mat-mdc-menu-item mat-focus-indicator ng-tns-c3371495337-7 ng-star-inserted'])[3]")
    public WebElement hamOutbox;

    @FindBy(xpath = "(//button[@class='mat-mdc-menu-item mat-focus-indicator ng-tns-c3371495337-7 ng-star-inserted'])[4]")
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

    @FindBy(xpath = "(//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple'])[19]")
    public WebElement sendButton;

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

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[7]")
    public WebElement chatMsgClos;

    @FindBy(xpath = "(//SPAN[@class='mat-focus-indicator'])[8]")
    public WebElement msg;

    @FindBy(xpath = "(//SPAN[@class='mat-focus-indicator'])[33]")
    public WebElement msgClos;

    @FindBy(xpath = "(//IMG[@_ngcontent-ng-c320871950=''])[1]")
    public WebElement profile;



    @FindBy(xpath="//SPAN[text()='Messaging']")
    public WebElement hamburgermenu_messaging;
    @FindBy(xpath="//span[contains(text(),'Trash')]")
    public WebElement Trash;


    @FindBy(xpath="//input[@id='mat-mdc-chip-list-input-0'] ")
    public WebElement Receivers;
    @FindBy(xpath="//button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-basic mat-mdc-button-base mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement AddReceivers;
    @FindBy(xpath="//ms-confirm-button[@class='ng-star-inserted']")
    public WebElement Movetotrash;
    @FindBy(xpath="//strong[contains(text(),'Confirm')]")
    public WebElement Confirm;
    @FindBy(xpath="//span[contains(text(),'Yes')]")
    public WebElement yesButton;
    @FindBy(xpath="(//ms-delete-button[@class='ng-star-inserted'])[1]")
    public WebElement deleteButton;
    @FindBy(xpath="//ms-standard-button[@icon='trash-restore']")
    public WebElement restoreButton;
    @FindBy(xpath="(//div[@class='mat-expansion-panel-body ng-tns-c857250080-107'])[1]")
    public WebElement successMessage;
    @FindBy(xpath="//Strong[contains(text(),'Delete')]")
    public WebElement deleteConfirm;
    @FindBy(xpath="//button[@class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']")
    public WebElement deletefinish;




    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[6]/following-sibling::span")
    public WebElement financeButton;

    @FindBy(xpath = "(//*[@data-icon='chart-mixed'])[1]")
    public WebElement gradingButton;

    @FindBy(xpath = "((//div[@class='mat-ripple mat-mdc-tab-ripple'])[3]//following-sibling::span)[1]//span")
    public WebElement transcriptBySubject;

    @FindBy(xpath = "(//span[@class='mdc-tab__content'])[2]")
    public WebElement studentTranscript;

    @FindBy(xpath = "//span[text()='Assignments']")
    public WebElement assignmentsButton;


    @FindBy(css = "[class='mdc-label']")
    public WebElement stripeButton;

    @FindBy(css = "[class='w-50-p discount-class']")
    public WebElement payAmountDue;

    @FindBy(xpath = "(//span[@class='w-50-p'])[2]")
    public WebElement payButton;

    @FindBy(xpath = "//ms-currency-field[@formcontrolname='customAmountField']//input")
    public WebElement InputAmount;

    @FindBy(xpath = "//ms-button")
    public WebElement PayButton1;

    @FindBy(css = "[name='number']")
    public WebElement cardNumber;

    @FindBy(xpath = "(//div[@class='p-Input'])[2]//input")
    public WebElement expirationNumber;

    @FindBy(xpath = "(//div[@class='p-Input'])[3]//input")
    public WebElement cvcNumber;

    @FindBy(xpath = "((//span[@class='mdc-button__label'])[15]//following-sibling::span)[1]")
    public WebElement StripePayments;
    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement confirmMessagePay;








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
            case "courses" : return this.courses;
            case "calendar" : return this.calendar;
            case "attendance" : return this.attendance;
            case "assignments" : return this.assignments;
            case "grading" : return this.grading;
            case "hamburgerMenu" : return this.hamburgerMenu;
            case "chatMsg" : return this.chatMsg;
            case "chatMsgClos" : return this.chatMsgClos;
            case "msg" : return this.msg;
            case "msgClos" :return this.msgClos;
            case "profile" : return this.profile;


            case "hamburgermenu_messaging" : return this.hamburgermenu_messaging;
            case "Trash" : return this.Trash;
            case "Receivers" : return this.Receivers;
            case "AddReceivers" : return this.AddReceivers;
            case "Movetotrash" : return this.Movetotrash;
            case "Confirm" : return this.Confirm;
            case "yesButton" : return this.yesButton;
            case "deleteButton" : return this.deleteButton;
            case "restoreButton" : return this.restoreButton;
            case "successMessage" : return this.successMessage;
            case "deleteConfirm" : return this.deleteConfirm;
            case "deletefinish" : return this.deletefinish;

            case "financeButton" : return this.financeButton;
            case "gradingButton" : return this.gradingButton;
            case "transcriptBySubject" : return this.transcriptBySubject;
            case "studentTranscript" : return this.studentTranscript;
            case "assignmentsButton" : return this.assignmentsButton;
            case "messaging" : return this.messaging;
            case "stripeButton" : return this.stripeButton;
            case "payAmountDue" : return this.payAmountDue;
            case "payButton" : return this.payButton;
            case "InputAmount" : return this.InputAmount;
            case "PayButton1" : return this.PayButton1;
            case "cardNumber" : return this.cardNumber;
            case "expirationNumber" : return this.expirationNumber;
            case "cvcNumber" : return this.cvcNumber;
            case "StripePayments" : return this.StripePayments;
            case "confirmMessagePay" :return this.confirmMessagePay;







        }

        return null;
    }


}

