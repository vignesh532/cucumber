package com.stepdefinition;

import org.junit.After;
import org.junit.Before;

import com.resources.FunctionalLibrary;

public class Hook extends FunctionalLibrary {
	
	@Before
	public void beforeBackground() {
		
getDriver();
enterUrl("http://demo.guru99.com/telecom/");
	}
	
	@After
	public void afterBackground() {
		driver.quit();

	}

}
