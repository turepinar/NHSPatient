package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/nhsPatient",
        glue= "stepDefinitions/nhsLogin",
        dryRun= false,
        //tags ="@Expected",
        plugin= {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class NHSRunner {

}
