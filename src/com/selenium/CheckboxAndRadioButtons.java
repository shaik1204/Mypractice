package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxAndRadioButtons {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		
	}

}
