package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DemoRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		//Robot class is a separate class in Java which will allow us to perform multiple tasks based on our requirement. 
		//It generally will throw AWT exception so we need to deal with it accordingly.
		
		//To use keyboard events you have to use to a method of Robot class.
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("shaikmunna216@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		Thread.sleep(2000);
		Robot rbt= new Robot();
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
