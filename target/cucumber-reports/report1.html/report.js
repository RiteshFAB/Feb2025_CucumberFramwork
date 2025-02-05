$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Facebook.feature");
formatter.feature({
  "name": "Facebook application testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login of Facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sainty"
    }
  ]
});
formatter.step({
  "name": "User launch url of Facebook Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.org.LoginStepDef.user_launch_url_of_Facebook_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the credetional of facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.org.LoginStepDef.user_enters_the_credetional_of_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.org.LoginStepDef.user_validate_the_Homepage()"
});
formatter.result({
  "status": "passed"
});
});