package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HrmsLoginTest {

	WebDriver driver;

	@BeforeTest
  public void appLaunch() {
	 
	driver= new FirefoxDriver();
	
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
	
  }

	@Test
	public void appLogin() throws Exception {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		  
	}

	@AfterTest
	public void appLogout() throws Throwable {
		
		Thread.sleep(3000);
		driver.close();
	}

}
