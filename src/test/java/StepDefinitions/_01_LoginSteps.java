package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;  // Burada yıldız hepsi demek , hepsi Eklendi, import oldu
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button") //yorummm
    public void enter_username_and_password_and_click_login_button() {
         dc.mySendKeys(dc.username, "Student_10");
        dc.mySendKeys(dc.password,"S12345");
        dc.myClick(dc.loginButton);
    }


    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.LoginContainsText(dc.headText,"Internship");
    }
}
