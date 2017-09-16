package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AssertTrue {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(6000);

		Assert.assertEquals("OrangeHRM", driver.getTitle());
		System.out.println(driver.getTitle());

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By
				.xpath(".//*[@id='menu_admin_viewAdminModule']/b"));
		act.moveToElement(element)
				.moveToElement(
						driver.findElement(By
								.xpath(".//*[@id='menu_admin_nationality']")))
				.click().build().perform();

		/*
		 * WebElement check=
		 * driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[2]/td[1]"
		 * ));
		 * 
		 * Boolean status = check.isDisplayed();
		 * System.out.println("Ashish check box clicked"+status); check.click();
		 */
		
		List<WebElement> list = driver.findElements(By.tagName("type"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.size());
			
			if(list.get(i).getAttribute("type").trim().equalsIgnoreCase("checkbox")){
				
				System.out.println("check box=" +i+ ""+list.get(i).getAttribute("arabic").trim());
			}
			
		}

	}

}
