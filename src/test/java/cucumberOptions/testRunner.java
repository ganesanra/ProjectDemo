package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepdefinitions"}, 
		plugin={"pretty","html:target/cucumber-reports/cucumber-pretty.html",
		        "json:target/cucumber-reports/CucumberTestReport.json"})


public class testRunner {

}
