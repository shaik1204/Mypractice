package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoOfLinksInBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		System.out.println("no of links are:"+ links.size());
		
		for (int i = 0; i < links.size(); i=i+1) {
		
			if (!links.get(i).getText().isEmpty()) {
				
				System.out.println(links.get(i).getText());
				
			}
		
			
		}

	}

}
