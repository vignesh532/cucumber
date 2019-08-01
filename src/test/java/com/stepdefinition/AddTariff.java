package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.objecrepository.AddTariffPage;
import com.objecrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AddTariff extends FunctionalLibrary {
	
	
		
		
	
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
	@When("Enter the tariff fields")
	public void user_is_entering_the_detailss() {
		HomePage hp=new HomePage();
		AddTariffPage addpage=new AddTariffPage();	
		
		
		button(hp.getAddTariffPlan());
		type(addpage.getRental(), "500");
		type(addpage.getLocalMinutes(), "100");
		type(addpage.getFreeIntMin(), "50");
		type(addpage.getFreeSmsPack(), "60");
		type(addpage.getLocalMinChrg(), "3");
		type(addpage.getInterMinChrg(), "500");
		type(addpage.getSmsChrg(), "500");
	}

	
	

	@When("User is clicking on submit")
	public void user_is_clicking_on_submit() {
		AddTariffPage addpage=new AddTariffPage();	 
		button(addpage.getSubmit());
	    
	}

	@Then("Validate that the tariff is updated")
	public void user_verify_the_tariff_plan_is_added_sucessfully() {
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}


}