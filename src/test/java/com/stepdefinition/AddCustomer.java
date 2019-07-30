package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer  {
	static WebDriver driver;
	
	@Given("User is in the homepage of site")
	public void user_is_in_the_homepage_of_site() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\CucmberPro\\Driver\\chromedriver.exe");
	    driver  = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");  
	    driver.manage().window().maximize();
	}

	@Given("User click on the add button")
	public void user_click_on_the_add_button() throws InterruptedException {
		
		WebElement cli = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		cli.click();
		
		
	}
  
	/*@When("User will enter the details")
	public void user_will_enter_the_details() {
	    
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Vignesh");
	    driver.findElement(By.id("lname")).sendKeys("Babu");
	    driver.findElement(By.id("email")).sendKeys("vignesh@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Salem");
	    driver.findElement(By.id("telephoneno")).sendKeys("9790230532");
	    } 
	*/
	/*@When("User will enter the detailss")
	public void user_will_enter_the_detailss(DataTable customerDetails) {
		
	List<String> details = customerDetails.asList(String.class);
	 driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(details.get(0));
	    driver.findElement(By.id("lname")).sendKeys(details.get(1));
	    driver.findElement(By.id("email")).sendKeys(details.get(2));
	    driver.findElement(By.name("addr")).sendKeys(details.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(details.get(4));
	}*/	
	
	@When("User will enter the details")
	public void user_will_enter_the_details(DataTable addTable) {
		Map<String, String> cus = addTable.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(cus.get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(cus.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(cus.get("mail"));
	    driver.findElement(By.name("addr")).sendKeys(cus.get("add"));
	    driver.findElement(By.id("telephoneno")).sendKeys(cus.get("mobile"));
	   
	}

	@When("User will click on the submit button")
	public void user_will_click_on_the_submit_button() {
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User will validate whether customer id is generated")
	public void user_will_validate_whether_customer_id_is_generated() {
	    WebElement l = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	    Assert.assertTrue(l.isDisplayed());
	    String a = l.getText();
	    System.out.println(a);
	    driver.quit();
	}

}
