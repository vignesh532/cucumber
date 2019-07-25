package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiCustomer {
	static WebDriver driver;
	@Given("User is in the homepage of")
	public void user_is_in_the_homepage_of() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\CucmberPro\\Driver\\chromedriver.exe");
	    driver  = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");  
	    driver.manage().window().maximize();
	    
	}

	@Given("User click on the add buttons")
	public void user_click_on_the_add_buttons() {
		WebElement cli = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		cli.click();
	    
	}

	@When("User will enter the details{string},{string},{string},{string},{string}")
	public void user_will_enter_the_details(String a, String b, String c, String d, String e) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(a);
	    driver.findElement(By.id("lname")).sendKeys(b);
	    driver.findElement(By.id("email")).sendKeys(c);
	    driver.findElement(By.name("addr")).sendKeys(d);
	    driver.findElement(By.id("telephoneno")).sendKeys(e);
	    
	}

	@When("User will click on the submit buttons")
	public void user_will_click_on_the_submit_buttons() {
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
		 WebElement l = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		    Assert.assertTrue(l.isDisplayed());
		    String a = l.getText();
		    System.out.println(a);
		    driver.quit();
	}

	@Then("User will validate whether customer id is generatedd")
	public void user_will_validate_whether_customer_id_is_generatedd() {
	    
	    
	}


}
