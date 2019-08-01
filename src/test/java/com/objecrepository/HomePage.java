package com.objecrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;
	
	@FindBy(xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement addTariffToCustomer;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTariffPlan;
	
	@FindBy(xpath="(//a[text()='Pay Billing'])[1]")
	private WebElement payBilling;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getAddTariffToCustomer() {
		return addTariffToCustomer;
	}

	public WebElement getAddTariffPlan() {
		return addTariffPlan;
	}

	public WebElement getPayBilling() {
		return payBilling;
	}
	
	

	
}


