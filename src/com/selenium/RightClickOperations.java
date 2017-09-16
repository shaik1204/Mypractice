package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperations {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		
		driver.manage().window().maximize();
		WebElement gmail =driver.findElement(By.linkText("Gmail"));
		
		Actions right = new Actions(driver);
		
		//right.contextClick(gmail).sendKeys("w").build().perform();
		
		right.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
	}

}
