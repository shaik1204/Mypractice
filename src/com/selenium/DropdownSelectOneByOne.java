package com.selenium;

import java.util.List;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownSelectOneByOne {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.name("country"));

		List<WebElement> countrylist = country.findElements(By
				.tagName("option"));
		System.out.println(countrylist.size());
		
		

		for (int i = 0; i < countrylist.size(); i++) {

			countrylist.get(i).click();

			/*if (countrylist.get(i).isSelected()) {
				System.out.println(countrylist.get(i).getText()
						+ " :Is Selected");
			} else {
				System.out.println(countrylist.get(i).getText()
						+ " :Is not selcetd");
			}*/
		}

	}
}
