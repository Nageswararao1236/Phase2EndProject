package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber-report","json:target/cucumber.json"},
		features="src/test/java/feature",
		glue="stepdefs",
		tags= {"@SauceLabs or @AddtoCart"}
		
		)
public class TestRunner {

}
