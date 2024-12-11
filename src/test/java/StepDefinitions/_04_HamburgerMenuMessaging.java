package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _04_HamburgerMenuMessaging {
    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();
    Actions actions= new Actions(GWD.getDriver());
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @When("Click on the Hamburger Menu")
    public void clickOnTheHamburgerMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.hamMenu));
        pp.myClick(dc.getWebElement("hamMenu"));

    }


    @And("Hover Over in the Messages")
    public void hoverOverInTheMessages() {
        actions.moveToElement(dc.getWebElement("hamMessaging")).build().perform();
    }

    @And("Click on the Send Message")
    public void clickOnTheSendMessage() {
        pp.myClick(dc.getWebElement("hamSendMessage"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "New Message","Doğru Sayfa Açılmadı");
    }

    @And("Click on the Inbox")
    public void clickOnTheInbox() {
        pp.myClick(dc.getWebElement("hamMenu"));
        actions.moveToElement(dc.getWebElement("hamMessaging"));
        pp.myClick(dc.getWebElement("hamInbox"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Inbox","Doğru Sayfa Açılmadı");

    }

    @And("Click on the Outbox")
    public void clickOnTheOutbox() {
        pp.myClick(dc.getWebElement("hamMenu"));
        actions.moveToElement(dc.getWebElement("hamMessaging"));
        pp.myClick(dc.getWebElement("hamOutbox"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Outbox","Doğru Sayfa Açılmadı");
    }

    @And("Click on the Trash")
    public void clickOnTheTrash() {
        pp.myClick(dc.getWebElement("hamMenu"));
        actions.moveToElement(dc.getWebElement("hamMessaging"));
        pp.myClick(dc.getWebElement("hamTrash"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Trash","Doğru Sayfa Açılmadı");
    }



}
