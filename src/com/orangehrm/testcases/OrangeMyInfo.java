package com.orangehrm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeMyInfo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);

		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName"))
				.sendKeys("Rasool");

		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Shaik");

		driver.findElement(By.xpath(".//*[@id='frmEmpPersonalDetails']/fieldset/ol[2]/li[4]/img")).click();

		Select slt = new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));

		slt.selectByIndex(10);

		System.out.println("month selected");
		
		Select slt1= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
		slt1.selectByValue("2018");
		
		System.out.println("year selected");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")).click();
		
		System.out.println("date selectd");
		driver.findElement(By.id("personal_optGender_1")).click();
		Select martial = new Select(driver.findElement(By.id("personal_cmbMarital")));
		martial.selectByValue("Single");
		
		Select nationality= new Select(driver.findElement(By.id("personal_cmbNation")));
		nationality.selectByVisibleText("ABC");
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
		System.out.println("member updation successfully");
		
		
		
	}

}
