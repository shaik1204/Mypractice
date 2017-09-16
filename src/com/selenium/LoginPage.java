package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		
		WebDriver driver =new FirefoxDriver();
		
		String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
				
		for (int i = 0; i < 5; i++) {
			
			driver.findElement(By.id("txtUsername")).click();
			System.out.println(i);
		}

	}

}
