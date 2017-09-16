package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {


WebDriver driver = new FirefoxDriver();

driver.get("https://www.airvistara.com/trip/");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.className("scombobox-display")).sendKeys("Hyderabad (HYD");
Thread.sleep(1000);

driver.findElement(By.xpath(".//*[@id='arrivesat-div']/input[1]")).sendKeys("Bengaluru (BLR)");

Thread.sleep(1000);

WebElement drop = driver.findElement(By.className("selectric"));

Select droplist = new Select(drop);

		droplist.selectByIndex(0);
		
	}

}
