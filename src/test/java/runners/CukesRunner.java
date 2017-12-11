package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target/cucumber", "json:target/report.json"},
		features="./src/test/resources/features",
		glue= "step_definitions",
		tags= {"@Regression","~@Smoke"},
		dryRun=false
		
		
		
		)

public class CukesRunner {

}
