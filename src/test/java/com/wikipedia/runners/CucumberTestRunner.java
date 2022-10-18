package com.wikipedia.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-results.xml"
        },
        glue = "com/wikipedia/step_def",
        features = "src/test/resources/features",
        tags = "@wip",
        dryRun = true
)
public class CucumberTestRunner {
}
