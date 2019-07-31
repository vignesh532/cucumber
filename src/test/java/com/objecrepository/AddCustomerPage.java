package com.objecrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//label[@for='done']")
	private WebElement radioButton;
	
	@FindBy(id="fname")
	private WebElement firstName;
	
	@FindBy(id="lname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement address;
	
	@FindBy(id="telephoneno")
	private WebElement phno;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}
	
	
}
