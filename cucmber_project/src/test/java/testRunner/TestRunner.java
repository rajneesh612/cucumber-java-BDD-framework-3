	package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue= {"stepDefinition"},
monochrome = true,
dryRun = false,
plugin= {"pretty","html:target/htmlReports"},
tags="@sakara")
public class TestRunner {

}
