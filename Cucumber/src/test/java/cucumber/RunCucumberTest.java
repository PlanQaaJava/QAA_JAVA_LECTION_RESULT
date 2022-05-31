package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumber/steps",
        plugin = {"pretty"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
