$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddTariff.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the tariff fields",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.user_is_entering_the_detailss()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is clicking on submit",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.user_is_clicking_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate that the tariff is updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.user_verify_the_tariff_plan_is_added_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});