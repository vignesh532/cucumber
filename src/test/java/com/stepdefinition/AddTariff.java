package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objecrepository.AddTariffPage;
import com.objecrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AddTariff extends FunctionalLibrary {
	static WebDriver driver;
	HomePage hp=new HomePage();
	AddTariffPage addpage=new AddTariffPage();	
	
		
		
	
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
	public void user_is_entering_the_detailss() {
		 
		
		buttonClick(hp.getAddTariffPlan());
		enterText(addpage.getRental(), "500");
		enterText(addpage.getLocalMinutes(), "100");
		enterText(addpage.getFreeIntMin(), "50");
		enterText(addpage.getFreeSmsPack(), "60");
		enterText(addpage.getLocalMinChrg(), "3");
		enterText(addpage.getInterMinChrg(), "500");
		enterText(addpage.getSmsChrg(), "500");
	}

	
	@When("User is clicking on submit")
	public void user_is_clicking_on_submit() {
	     buttonClick(addpage.getSubmit());
	    
	}

	@Then("User verify the tariff plan is added sucessfully")
	public void user_verify_the_tariff_plan_is_added_sucessfully() {
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}


}
