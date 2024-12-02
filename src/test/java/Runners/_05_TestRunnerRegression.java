package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest", //sadece tag i belirtilen senaryoları çalıştırır
        features = {"src/test/java/FeatureFiles"},//klasördeki bütün feature lar
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
// group da or var ise : herhangi birisi olan çağrılır
// group da and var ise : her iki grup adı olanlar çağrılır