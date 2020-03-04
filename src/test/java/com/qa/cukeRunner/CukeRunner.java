package com.qa.cukeRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/qa/features/",
        glue={"com/qa/stepDefs"},
        plugin = { "pretty", "html:target/cucumber-reports" }
)

public class CukeRunner {

}


