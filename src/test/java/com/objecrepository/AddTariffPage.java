package com.objecrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPage extends FunctionalLibrary{
	
	public AddTariffPage() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="rental1")
	private WebElement rental;
	
	@FindBy(id="local_minutes")
	private WebElement localMinutes;
	
	@FindBy(id="inter_minutes")
	private WebElement freeIntMin;
	
	@FindBy(id="sms_pack")
	private WebElement freeSmsPack;
	
	@FindBy(id="minutes_charges")
	private WebElement localMinChrg;
	
	@FindBy(id="inter_charges")
	private WebElement interMinChrg;

	@FindBy(id="sms_charges")
	private WebElement smsChrg;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getRental() {
		return rental;
	}

	public WebElement getLocalMinutes() {
		return localMinutes;
	}

	public WebElement getFreeIntMin() {
		return freeIntMin;
	}

	public WebElement getFreeSmsPack() {
		return freeSmsPack;
	}

	public WebElement getLocalMinChrg() {
		return localMinChrg;
	}

	public WebElement getInterMinChrg() {
		return interMinChrg;
	}

	public WebElement getSmsChrg() {
		return smsChrg;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}


