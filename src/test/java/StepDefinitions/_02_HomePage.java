package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class _02_HomePage {
    DialogContent dc=new DialogContent();
    ParentPage pp = new ParentPage();

    @When("click the logo")
    public void clickTheLogo() {
        pp.myClick(dc.logo);
    }

    @Then("must verify that the home page opens")
    public void mustVerifyThatTheHomePageOpens() {


        Set<String> idler = GWD.getDriver().getWindowHandles();
        Iterator gosterge = idler.iterator();
        String birinciPencereId = gosterge.next().toString();
        String ikinciPencereId = gosterge.next().toString();

        GWD.getDriver().switchTo().window(ikinciPencereId); // 2. pencereye yani taba geçtim


        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("techno.study"),"Sayfaya erişilemedi!");
    }
}
