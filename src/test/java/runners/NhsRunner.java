package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= "stepDefinitions/nhsSteps",
        dryRun= false,
        tags = "@Proj-T14 or @Proj-T15",
        plugin= {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class NhsRunner {

}
