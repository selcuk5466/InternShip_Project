package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _07_HamburgerMenu {

    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();


    @When("Click trash and see and click delete ıtem and restore ıtem")
    public void clickTrashAndSeeAndClickDeleteItemAndRestoreItem() {
        pp.myClick(dc.getWebElement("hamburgerMenu"));
        pp.myClick(dc.getWebElement("hamburgermenu_messaging"));
        pp.myClick(dc.getWebElement("Trash"));

        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteButton));
        Assert.assertTrue(dc.deleteButton.isEnabled());
        dc.wait.until(ExpectedConditions.visibilityOf(dc.restoreButton));
        Assert.assertTrue(dc.restoreButton.isEnabled());
        dc.myClick(dc.restoreButton);
        
    }

    @Then("restore success and confirm  delete ıtem and successmessage")
    public void restoreSuccessAndConfirmDeleteItemAndSuccessmessage() {

        dc.myClick(dc.deleteButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteConfirm));
        Assert.assertTrue(dc.deleteConfirm.isDisplayed());
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deletefinish));
        dc.myClick(dc.deletefinish);
    }
}
