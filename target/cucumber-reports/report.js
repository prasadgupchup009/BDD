$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/qa/features/substraction_withMapDataTable.feature");
formatter.feature({
  "line": 2,
  "name": "Cucumber can convert a Gherkin data table to a list of a type you specify.",
  "description": "",
  "id": "cucumber-can-convert-a-gherkin-data-table-to-a-list-of-a-type-you-specify.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sub"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "The sum of a list of numbers should be calculated",
  "description": "",
  "id": "cucumber-can-convert-a-gherkin-data-table-to-a-list-of-a-type-you-specify.;the-sum-of-a-list-of-numbers-should-be-calculated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have Numbers below",
  "rows": [
    {
      "cells": [
        "Number1",
        "Number2"
      ],
      "line": 7
    },
    {
      "cells": [
        "10",
        "5"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I perform substraction",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "should I get the  value",
  "keyword": "Then "
});
formatter.match({
  "location": "substraction_withMapDataTable.i_have_list_below(DataTable)"
});
formatter.result({
  "duration": 64414738,
  "status": "passed"
});
formatter.match({
  "location": "substraction_withMapDataTable.i_perform_substraction()"
});
formatter.result({
  "duration": 17645,
  "status": "passed"
});
formatter.match({
  "location": "substraction_withMapDataTable.should_I_get_the_value()"
});
formatter.result({
  "duration": 116670,
  "status": "passed"
});
});