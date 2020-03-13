package com.qa.cukeRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/qa/features/substraction_withMapDataTable.feature",
        glue={"com/qa/stepDefs"},
        plugin = { "pretty", "html:target/cucumber-reports" ,"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extent-report/report.html" },
        tags = {"@sub"}
)

public class CukeRunner {
}


