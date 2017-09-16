package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultipleHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		String Parent =driver.getWindowHandle();
		String ChildWindow= driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@id='text-2']/div/div/a/img")).click();
         
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		
		while(it.hasNext()){
			
			
		}
	}

}
