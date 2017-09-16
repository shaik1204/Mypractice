package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNg {

	@Test()
	public void apppLaunch() {

		System.out.println("App launch login successfully");
	}

	@Test()
	public void appLogin() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		driver.findElement(By.id("btnLogin")).click();
	}
}
