package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		
		String date = "30/august/2017";
		//String date1 = "15/august/2017";
		
		String [] dataspilt =date.split("/");
		//String [] dataspilt1 =date1.split("/");
		
		String day =  dataspilt[0];
		String month = dataspilt[1];
		String year = dataspilt[2];
		/*String day1 = dataspilt1[0];
		String month1 = dataspilt1[1];
		String year1 = dataspilt1[2]*/;
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("RoundTrip")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		Thread.sleep(2000);
		driver.findElement(By.id("ToTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		
		driver.findElement(By.id("DepartDate")).click();
		
		//year selection
		
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			
		 calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
		//month selection
		
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		//day selection
		//rows count
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='monthBlock first']/table/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++) 
		{		
		//columns count
		
		List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
		
		for (int j = 0; j < col.size(); j++) 
		{
			String calday = col.get(j).getText();
			
			if (calday.equals(day)) {
				col.get(j).click();
				break;
				
			}
		}
			
		}	

		
	}	

}


