package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmsAutoIt {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("rasool");
		
		driver.findElement(By.id("lastName")).sendKeys("shiak");
		
		driver.findElement(By.id("photofile")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Rshaik\\Desktop\\rasool\\sena.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("file uploade successfully");
		

	}

}
