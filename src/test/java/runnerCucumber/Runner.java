package runnerCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        //featurFile
        features = {
                "src/main/resources/Features/Login.feature",
                "src/main/resources/Features/Alerts.feature"
        },
        //stepdDefs
        glue = {"StepDefinitions","HooksPackage"},
        //plugin
        plugin = {"pretty",
        "html:target/cucumber-html-report.html"
        },
        monochrome = true,
        tags = "@valid"
)
public class Runner extends AbstractTestNGCucumberTests {

}
