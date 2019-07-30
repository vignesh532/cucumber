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
  "status": "passed"
});
formatter.step({
  "name": "User click on the Add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.user_click_on_the_Add_tariff_button()"
});
formatter.result({
  "status": "passed"
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
  "name": "User verify the tariff plan is added sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.user_verify_the_tariff_plan_is_added_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/Addcustomer.feature");
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
  "name": "Need to create a new customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@vignesh"
    }
  ]
});
formatter.step({
  "name": "User is in the homepage of site",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.user_is_in_the_homepage_of_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the add button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_click_on_the_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the details",
  "rows": [
    {
      "cells": [
        "fname",
        "Vignesh"
      ]
    },
    {
      "cells": [
        "lname",
        "Babu"
      ]
    },
    {
      "cells": [
        "mail",
        "vignesh@gmail.com"
      ]
    },
    {
      "cells": [
        "add",
        "Salem"
      ]
    },
    {
      "cells": [
        "mobile",
        "9790230532"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.user_will_enter_the_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_will_click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will validate whether customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.user_will_validate_whether_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});