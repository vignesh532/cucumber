package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class AddTariff {
	static WebDriver driver;
	@Given("User is in the homepage")
	public void user_is_in_the_homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\CucmberPro\\Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom");  
	    driver.manage().window().maximize();
	}
	@Given("User click on the Add tariff button")
	public void user_click_on_the_Add_tariff_button() {
		
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();    
	}
/*	@When("User is entering the details")
	public void user_is_entering_the_details(DataTable tariffDetails) {
		List<String> tariffPlan = tariffDetails.asList(String.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("rental1")).sendKeys(tariffPlan.get(0));
		driver.findElement(By.name("local_minutes")).sendKeys(tariffPlan.get(1));
		driver.findElement(By.name("inter_minutes")).sendKeys(tariffPlan.get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(tariffPlan.get(3));
		driver.findElement(By.name("minutes_charges")).sendKeys(tariffPlan.get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(tariffPlan.get(5));
		driver.findElement(By.name("sms_charges")).sendKeys(tariffPlan.get(6));	     
	}*/
	@When("User is entering the detailss")
	public void user_is_entering_the_detailss(DataTable dataMap) {
		Map<String, String> tariff = dataMap.asMap(String.class, String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(tariff.get("monRent"));
		driver.findElement(By.name("local_minutes")).sendKeys(tariff.get("flmin"));
		driver.findElement(By.xpath("inter_minutes")).sendKeys(tariff.get("fim"));
		driver.findElement(By.name("sms_pack")).sendKeys(tariff.get("fsp"));
		driver.findElement(By.name("minutes_charges")).sendKeys(tariff.get("lpmc"));
		driver.findElement(By.name("inter_charges")).sendKeys(tariff.get("ipmc"));
		driver.findElement(By.name("sms_charges")).sendKeys(tariff.get("spc"));	
	   
	}

	
	@When("User is clicking on submit")
	public void user_is_clicking_on_submit() {
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User verify the tariff plan is added sucessfully")
	public void user_verify_the_tariff_plan_is_added_sucessfully() {
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}


}
