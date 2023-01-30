$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login to Fleet site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters fleet site url and hit enter",
  "keyword": "And "
});
formatter.step({
  "name": "user accepts cookies",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on register link",
  "keyword": "And "
});
formatter.step({
  "name": "user login into application with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user navigates to Home page",
  "keyword": "Then "
});
formatter.step({
  "name": "user name is displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "fleetprod1@mailinator.com",
        "password1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fleet site url and hit enter",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_enters_fleet_site_url_and_hit_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accepts cookies",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_accepts_cookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.register_link_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login into application with fleetprod1@mailinator.com and password1",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_login_into_application_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user name is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.stepDefinition.user_name_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});