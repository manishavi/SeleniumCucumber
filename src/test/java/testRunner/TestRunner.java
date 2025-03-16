package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/manishalal972/eclipse-workspace/SeleniumCucumber/src/resources/Features/OrangeHRM.feature",
		glue="stepdefinitions",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
				}
		)
public class TestRunner {

}
