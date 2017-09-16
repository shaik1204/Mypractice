package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		String homepage = driver.getWindowHandle();
		String homepage2 = driver.getWindowHandle();
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			
			String currentwindow = it.next().toString();
			if (!homepage.equals(currentwindow)) {
				driver.switchTo().window(currentwindow);
				Thread.sleep(2000);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
				
				//driver.getTitle().equals(homepage2);
				System.out.println(driver.getTitle());
			}
		}
	}

}
