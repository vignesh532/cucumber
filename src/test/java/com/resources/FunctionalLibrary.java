package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium Project\\WorkSpace\\LoginFb\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void enterUrl(String url) {
		driver.get(url);

	}

	public static void closebrowser() {

		driver.close();

	}

	public static void currenturl() {
		String hm = driver.getCurrentUrl();
		System.out.println(hm);

	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void enterText(WebElement element, String name) {

		element.sendKeys(name);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void selectByindex(WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);

	}

	public static void selectByValue(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);
	}

	public static void selectByVisibleText(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public static void GetAttribute(WebElement e, String m) {
		e.getAttribute("value");
		m = e.getText();
		System.out.println(m);
	}


}
