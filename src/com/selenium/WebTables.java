package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
		
		for (int i = 0; i < rows.size(); i++) {
			//System.out.println("row"+rows.size());
			for(int j=0;j< columns.size();j++){
				//System.out.println("columns"+columns.size());
				if(i==2 && j== 3){
					System.out.println(columns.get(j).getText());
			}
		
		}
	
	}

	}
}
