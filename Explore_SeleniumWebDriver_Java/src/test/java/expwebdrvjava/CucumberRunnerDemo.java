package expwebdrvjava;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/FeatureFiles" , glue = {"StepDefinition", "MyHooks"}
//, 
//dryRun = true

, strict = true,
monochrome = true
,  plugin = {"pretty", "json: Reports/JsonReport.json", 
		"html:target/Reports/WebReport", "junit: Reports/XMLReport.xml" }, tags = "@Progression" )


public class CucumberRunnerDemo {
	  

}
