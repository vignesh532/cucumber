package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/AddTariff.feature",glue="com.stepdefinition",monochrome=true,
plugin= {"html:target","json:target/report.json","rerun:src/test/resources/failed.txt"})

public class TestRunner {

}
