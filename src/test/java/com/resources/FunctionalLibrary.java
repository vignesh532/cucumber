package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	public void launch(String url) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\CucmberPro\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get(url);

	}
	
	public void type(WebElement ele,String name) {
		ele.sendKeys(name);

	}
	
	public void button(WebElement ele) {
		ele.click();

	}
	

}
