package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class _05_SendNewMessage {
    ParentPage parentPage=new ParentPage();
    DialogContent dialogContent=new DialogContent();
    Actions actions=new Actions(GWD.getDriver());


    @And("Enter form information")
    public void enterFormInformation() {
        parentPage.myClick(dialogContent.getWebElement("addReceiver"));
        parentPage.mySendKeys(dialogContent.getWebElement("nameOrEmail"),"stu");
        parentPage.myClick(dialogContent.getWebElement("selectReceiver"));
        parentPage.myClick(dialogContent.getWebElement("addClose"));
        parentPage.mySendKeys(dialogContent.getWebElement("subject"),"Test");
        parentPage.mySendKeys(dialogContent.getWebElement("textInMessage"),"Team 10 Test Message");
        parentPage.myClick(dialogContent.getWebElement("sendButton"));
        dialogContent.verifyMessageContainsText("success");

    }

    @Then("Click on the Outbox and you should be see sent messages")
    public void clickOnTheOutboxAndYouShouldBeSeeSentMessages() {
        parentPage.myClick(dialogContent.getWebElement("hamMenu"));
        actions.moveToElement(dialogContent.getWebElement("hamMessaging"));
        parentPage.myClick(dialogContent.getWebElement("hamOutbox"));
        List<WebElement> messages=GWD.getDriver().findElements(By.xpath("//tbody[@role='rowgroup']/tr"));
        Assert.assertTrue(!(messages.isEmpty()),"Gönderilen mesajlar açılamadı");
    }
}
