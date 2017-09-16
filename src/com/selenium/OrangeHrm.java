package com.selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		/*
		 * driver.findElement(By.className("firstLevelMenu")).click();
		 * driver.findElement(By.linkText("Reports")).click();
		 */

		WebElement time = driver.findElement(By.className("firstLevelMenu"));
		System.out.println("first menu clicked");
		WebElement reports = driver.findElement(By
				.xpath("//a[@id='menu_time_viewTimeModule']"));
		System.out.println("reports clicked");
		WebElement attendencesummary = driver
				.findElement(By
						.xpath("//a[@id='menu_time_displayAttendanceSummaryReportCriteria']"));
		
		
		driver.findElement(By.xpath("//a[@id='menu_time_displayAttendanceSummaryReportCriteria']"));
		/*Actions act = new Actions(driver);
		act.moveToElement(time).pause(2000).moveToElement(reports).pause(2000).moveToElement(attendencesummary).click().build().perform();
		
		System.out.println("pim clicked");
		System.out.println("reports clicked");
		System.out.println("attendance clicked");*/
		

	}

}
