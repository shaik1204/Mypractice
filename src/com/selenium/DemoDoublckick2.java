package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDoublckick2 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("text")).sendKeys("58758");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		Alert alt= driver.switchTo().alert();
		
		String altmessage= driver.switchTo().alert().getText();
		System.out.println(altmessage);
		
	}

}
