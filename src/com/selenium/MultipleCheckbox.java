package com.selenium;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement check =driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement> checklist = check.findElements(By.tagName("input"));
		System.out.println(checklist.size());
		for (int i = 0; i < checklist.size(); i++) {
			//System.out.println(checklist.get(i).getAttribute("checked")+""+checklist.get(i).getAttribute("value"));
			
		if (checklist.get(i).getAttribute("value").equals("Butter")) {
			
			//checklist.get(i).isEnabled().notify();
	  checklist.get(i).click();
	  System.out.println("butter unchecked");
	  
	  }
		if (checklist.get(i).getAttribute("value").equals("Cheese")) {
			checklist.get(i).click();
			System.out.println("Cheese checked");
		}
	}
		
		
		//Note: i have a doubt when i run the program i want to select cheese,but bydefault it was checked buttuer also,,, how to uncheck these element
		
		
		
	}
}
