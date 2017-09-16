package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("HITECH CITY HYDERABAD");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		System.out.println("pop up closed");
	}

}
