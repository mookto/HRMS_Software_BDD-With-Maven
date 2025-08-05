package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepsDefs",
	    plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-reports/cucumber.json"},
	    monochrome = true
	)
public class TestRunner extends AbstractTestNGCucumberTests{

}
