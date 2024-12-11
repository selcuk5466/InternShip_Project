package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class _04_HamburgerMenuMessaging {
    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @When("Click on the Hamburger Menu")
    public void clickOnTheHamburgerMenu() {
        wait.until(elementToBeClickable(dc.hamburgerMenu));
        pp.myClick(dc.getWebElement("hamburgerMenu"));

    }


    @And("Hover Over in the Messages")
    public void hoverOverInTheMessages() {
        pp.myClick(dc.getWebElement("hamburgermenu_messaging"));
    }

    @And("Click on the Send Message")
    public void clickOnTheSendMessage() {
  //    try {
  //        // JavascriptExecutor oluştur
  //        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
  //        // Elemente tıklamak için JavaScript kodu çalıştır
  //        js.executeScript("arguments[0].click();", dc.hamSendMessage);
  //        System.out.println("Elemente JavaScript ile tıklandı.");
  //    } catch (Exception e) {
  //        System.err.println("JavaScript ile tıklama işlemi başarısız oldu: " + e.getMessage());
  //    }
        wait.until(elementToBeClickable(dc.hamSendMessage));
        pp.myClick(dc.getWebElement("hamSendMessage"));

        Assert.assertTrue(dc.sendButton.isDisplayed(),"Doğru sayfa açılmadı");
    }

    @And("Click on the Inbox")
    public void clickOnTheInbox() {
        pp.myClick(dc.getWebElement("hamMenu"));
        pp.myClick(dc.getWebElement("hamburgermenu_messaging"));
        wait.until(elementToBeClickable(dc.hamInbox));
        pp.myClick(dc.getWebElement("hamInbox"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Inbox","Doğru Sayfa Açılmadı");

    }

    @And("Click on the Outbox")
    public void clickOnTheOutbox() {
        pp.myClick(dc.getWebElement("hamMenu"));
        pp.myClick(dc.getWebElement("hamburgermenu_messaging"));
        wait.until(elementToBeClickable(dc.hamOutbox));
        pp.myClick(dc.getWebElement("hamOutbox"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Outbox","Doğru Sayfa Açılmadı");
    }

    @And("Click on the Trash")
    public void clickOnTheTrash() {
        pp.myClick(dc.getWebElement("hamMenu"));
        pp.myClick(dc.getWebElement("hamburgermenu_messaging"));
        wait.until(elementToBeClickable(dc.hamTrash));
        pp.myClick(dc.getWebElement("hamTrash"));
        Assert.assertEquals(dc.getWebElement("openedPageElement"),
                "Trash","Doğru Sayfa Açılmadı");
    }



}
