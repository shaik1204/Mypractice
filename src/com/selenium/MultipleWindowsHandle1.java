package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandle1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://seleniummaster.com/");
		driver.manage().window().maximize();

		Thread.sleep(8000);

		driver.findElement(By.xpath("//div[@id='text-2']/div/div/a/img")).click();

		String Parent_Window = driver.getWindowHandle();
		// String Child_Window= driver.getWindowHandle();

		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			
		}
			Thread.sleep(3000);

		driver.findElement(By.id("masthead-search-term")).sendKeys("selenium");
		driver.findElement(By.xpath(".//*[@id='search-btn']")).click();
		Thread.sleep(3000);
		System.out.println("child window performed");
			
		driver.switchTo().window(Parent_Window);
		Thread.sleep(3000);

		System.out.println("parent window opened");

		driver.findElement(By.xpath(".//*[@id='menu-item-202']/a")).click();

	}

}
