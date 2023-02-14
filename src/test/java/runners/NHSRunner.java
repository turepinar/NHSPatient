package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/nhsPatiente",
        glue="StepDefinitions/NHSLoginSteps",
        dryRun= false,
        plugin= {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class NHSRunner {

}
