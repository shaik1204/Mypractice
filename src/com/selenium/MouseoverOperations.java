package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ceoandhra.nic.in/home.aspx");
		
		driver.manage().window().maximize();
		
		WebElement eregister =  driver.findElement(By.linkText("E-Registration"));
	    WebElement assembly = driver.findElement(By.xpath("//div[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
	    WebElement ststus = driver.findElement(By.xpath("//div[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[6]/a"));
	    
		Actions mouse= new Actions(driver);
		mouse.moveToElement(eregister).moveToElement(assembly).pause(2000).moveToElement(ststus).click().build().perform();
		
		
		/*Thread.sleep(2000);
//		mouse.moveToElement(assembly).click().build().perform();
		System.out.println("E-regristartion clicked");
		System.out.println("assembly clicked");*/
		
		

	}

}
