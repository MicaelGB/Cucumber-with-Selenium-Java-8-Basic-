$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9608197900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 2524341300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 763204700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 474031800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 339746700,
  "status": "passed"
});
formatter.after({
  "duration": 181200,
  "status": "passed"
});
});