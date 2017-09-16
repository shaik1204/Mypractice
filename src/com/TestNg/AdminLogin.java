package com.TestNg;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	
	@Test()
		
		public void appLogin() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		}
	
}
