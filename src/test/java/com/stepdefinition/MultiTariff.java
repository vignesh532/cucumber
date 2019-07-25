package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiTariff {

	static WebDriver driver;
	@Given("User is in the homepages")
	public void user_is_in_the_homepages() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\CucmberPro\\Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom");  
	    driver.manage().window().maximize();
	    
	}

	@Given("User click on the Add tariff buttons")
	public void user_click_on_the_Add_tariff_buttons() {
	    
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click(); 
	}
	@When("User is entering the details{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_entering_the_details(String a, String b, String c, String d, String e, String f, String g) {
		driver.findElement(By.id("rental1")).sendKeys(a);
		driver.findElement(By.name("local_minutes")).sendKeys(b);
		driver.findElement(By.name("inter_minutes")).sendKeys(c);
		driver.findElement(By.name("sms_pack")).sendKeys(d);
		driver.findElement(By.name("minutes_charges")).sendKeys(e);
		driver.findElement(By.name("inter_charges")).sendKeys(f);
		driver.findElement(By.name("sms_charges")).sendKeys(g);	
	    
	}

	@When("User is clicking on submitt")
	public void user_is_clicking_on_submitt() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User verify the tariff plan is added sucessfullys")
	public void user_verify_the_tariff_plan_is_added_sucessfullys() {
		   Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		   driver.quit();
	    
	}



}
