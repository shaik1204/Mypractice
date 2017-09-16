package com.TestNg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicPractice {

	@Test()
	public void appLaunch() {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("rangehrm.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
}
