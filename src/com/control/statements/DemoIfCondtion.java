package com.control.statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DemoIfCondtion {

	//The Java if statement is used to test the condition. It checks boolean condition: true or false.
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String exptitle= "OrangeHRM";
		String actualtitle= driver.getTitle();
		
		/*if (exptitle.equals(actualtitle)) {
			System.out.println("orange hrm page opend");
			}else {
				System.out.println("orange hrm page is not opend");
			}
	}*/

		Assert.assertEquals(actualtitle, exptitle);
	}
}
