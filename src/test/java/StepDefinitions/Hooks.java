package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {   //Kanca



    @After
    public void after(Scenario senaryo)
    {
        ExcelUtility.writeToExcel("src/test/java/0_Resource/CucumberTestSonuçlari.xlsx",
                senaryo.getName(),
                senaryo.isFailed() ? "Fail": "Passed"
                );


        GWD.quitDriver();
    }

}
