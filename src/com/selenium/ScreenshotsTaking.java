package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotsTaking {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Rshaik\\Desktop\\raj\\rasool.Png"));
	
	}

}
