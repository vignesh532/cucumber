package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.objecrepository.AddCustomerPage;
import com.objecrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps extends FunctionalLibrary{

	

	

	@When("I need to enter the fields present")
	public void i_need_to_enter_the_fields_present() throws InterruptedException {
		Thread.sleep(5000);
		HomePage page=new HomePage();
		AddCustomerPage page2=new AddCustomerPage();
		
	  button(page.getAddCustomer());
	    button(page2.getRadioButton());
	    type(page2.getFirstName(), "karthi");
	    type(page2.getLastName(), "rajan");
	    type(page2.getMail(), "rrrr@gmail.com");
	    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("nellai");
	    driver.findElement(By.id("telephoneno")).sendKeys("9789931161");
	    
	    
	}
	@When("click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}	
	
	

@Then("I validate whether i got the customer id")
	public void i_validate_whether_i_got_the_customer_id() {
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	
	}

}
