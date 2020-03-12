$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/qa/features/substraction_withMapDataTable.feature");
formatter.feature({
  "name": "Cucumber can convert a Gherkin data table to a list of a type you specify.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sub"
    }
  ]
});
formatter.scenario({
  "name": "The sum of a list of numbers should be calculated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sub"
    }
  ]
});
formatter.step({
  "name": "I have list below",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepDefs.substraction_withMapDataTable.i_have_list_below(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I perform substraction",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepDefs.substraction_withMapDataTable.i_perform_substraction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should I get the  value",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepDefs.substraction_withMapDataTable.should_I_get_the_value()"
});
formatter.result({
  "status": "passed"
});
});