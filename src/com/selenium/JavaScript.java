package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {

		// Java script executor is an interfacse it will provides execute
		// javascript through selenium webdriver

		// Two javascript executor methods, i.e :: 1.executescript::2.
		// executeAsyncScript
		// Generate pop up window
		// Click action
		// refresh browser
		// get inner text of web page
		// get tittle of web page
		// scroll page

		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,800)");

	}

}
