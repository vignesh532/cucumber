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
  "name": "User is in the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff.user_is_in_the_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the Add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.user_click_on_the_Add_tariff_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is entering the detailss",
  "rows": [
    {
      "cells": [
        "monRent",
        "500"
      ]
    },
    {
      "cells": [
        "flmin",
        "50"
      ]
    },
    {
      "cells": [
        "fim",
        "20"
      ]
    },
    {
      "cells": [
        "fsp",
        "15"
      ]
    },
    {
      "cells": [
        "lpmc",
        "2"
      ]
    },
    {
      "cells": [
        "ipmc",
        "10"
      ]
    },
    {
      "cells": [
        "spc",
        "3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.user_is_entering_the_detailss(DataTable)"
});
formatter.result({
  "status": "skipped"
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