$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/qa/features/login.feature");
formatter.feature({
  "name": "Opening the Browser",
  "description": "  As A User\n  I want to open the browser\n  So That I can navigate to flight booking site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Opening the Browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepDefs.loginPageStefDef.theBrowserIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepDefs.loginPageStefDef.userLogsIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepDefs.loginPageStefDef.userSeesLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepDefs.loginPageStefDef.browserIsClosed()"
});
formatter.result({
  "status": "passed"
});
});