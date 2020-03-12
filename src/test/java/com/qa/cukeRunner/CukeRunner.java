package com.qa.cukeRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/qa/features/substraction_withMapDataTable.feature",
        glue={"com/qa/stepDefs"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags = {"@sub"}
)

public class CukeRunner {
}


