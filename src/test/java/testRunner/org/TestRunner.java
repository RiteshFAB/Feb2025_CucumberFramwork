package testRunner.org;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Features\\Facebook.feature",
		glue="StepDef.org",
		dryRun=false,
		monochrome=true,
		tags="@Sainty",
        plugin={"pretty","html:target\\cucumber-reports\\report1.html"}
		
		)




public class TestRunner {

}
