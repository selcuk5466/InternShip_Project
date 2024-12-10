package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _11_HamurgerMenu_Finance extends ParentPage {

    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();


    @And("Click on the element Top Menu")
    public void clickOnTheElementTopMenu() {
        
    }

    @Then("Hover Over the Finance button")
    public void hoverOverTheFinanceButton() {
        
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog() {
        Actions actionDriver = new Actions(GWD.getDriver());
        actionDriver.moveToElement(dc.financeButton).build().perform();
    }

    @And("Click the Stripe button to choose the payment method")
    public void clickTheStripeButtonToChooseThePaymentMethod() {
        wait.until(ExpectedConditions.visibilityOf(dc.stripeButton));
        dc.myClick(dc.stripeButton);
    }

    @And("Enter the amount to be paid")
    public void enterTheAmountToBePaid() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ms-currency-field[@formcontrolname='customAmountField']")));
        dc.mySendKeys(dc.InputAmount, "8");
    }

    @And("Click the Pay button")
    public void clickThePayButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ms-button")));
        dc.myClick(dc.PayButton1);
        dc.myClick(dc.PayButton1);
        
    }

    @And("User must enter card details")
    public void userMustEnterCardDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='__PrivateStripeElement']>iframe")));
        WebElement frame = GWD.getDriver().findElement(By.cssSelector("[class='__PrivateStripeElement']>iframe"));
        GWD.getDriver().switchTo().frame(frame);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='number']")));
        dc.mySendKeys(dc.cardNumber, "1010 1010 1010 1010");

        dc.mySendKeys(dc.expirationNumber, "2525");
        dc.mySendKeys(dc.cvcNumber, "252");

        GWD.getDriver().switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOf(dc.StripePayments));
        dc.myClick(dc.StripePayments);
    }

    @And("The user should receive a confirmation message that they have paid")
    public void theUserShouldReceiveAConfirmationMessageThatTheyHavePaid() {
        wait.until(ExpectedConditions.visibilityOf(dc.confirmMessagePay));
        dc.verifyContainsText(dc.confirmMessagePay, "Student Payment successfully created");
    }
}
