$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddTariff.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is entering the detailss",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.user_is_entering_the_detailss()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat com.resources.FunctionalLibrary.buttonClick(FunctionalLibrary.java:47)\r\n\tat com.stepdefinition.AddTariff.user_is_entering_the_detailss(AddTariff.java:39)\r\n\tat ✽.User is entering the detailss(src/test/resources/AddTariff.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User is clicking on submit",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.user_is_clicking_on_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify the tariff plan is added sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.user_verify_the_tariff_plan_is_added_sucessfully()"
});
formatter.result({
  "status": "skipped"
});
});