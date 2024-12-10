package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.tools.Tool;

public class _03_Home_2
{
    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();

    @When("click on the menu items")
    public void clickOnTheMenuItems() {
        pp.myClick(dc.getWebElement("courses"));
        pp.myClick(dc.getWebElement("calendar"));
        pp.myClick(dc.getWebElement("attendance"));
        pp.myClick(dc.getWebElement("assignments"));
        pp.myClick(dc.getWebElement("grading"));
       pp.myClick(dc.getWebElement("hamburgerMenu"));
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

        WebElement takeTest=GWD.getDriver().findElement(By.xpath("(//SPAN[@class='mat-focus-indicator'])[7]"));
       // takeTest.click();// sayfa önünden mouse clickk

        js.executeScript("arguments[0].click();", takeTest);

        pp.myClick(dc.getWebElement("chatMsg"));


        pp.myClick(dc.getWebElement("chatMsgClos"));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        pp.myClick(dc.getWebElement("msg"));

        pp.myClick(dc.getWebElement("msgClos"));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        pp.myClick(dc.getWebElement("profile"));





    }

    @Then("must verify that the menu page opens")
    public void mustVerifyThatTheMenuPageOpens() {
    }
}
