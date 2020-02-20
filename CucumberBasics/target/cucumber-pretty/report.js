$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "LoginFeature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});