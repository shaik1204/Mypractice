package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDoubleClick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("fname")).sendKeys("trasoo");
		
		Actions act= new Actions(driver);
		
		WebElement element= driver.findElement(By.id("dblClkBtn"));
		act.doubleClick(element).build().perform();
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		alt.accept();

		System.out.println(alt.getText());
		

	}

}
