package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.cli.Main;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "stepdefs",
		tags = "@tag1",
		plugin = {
				"pretty",
				"html:target/html/htmlreport.html",
				"json:target/json/file.json",
		},
		monochrome = true,
		publish=true,
		dryRun =false
		)




public class TestRunner {

}
