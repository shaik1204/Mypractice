package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperations {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		
		File src= new File("C:\\Users\\Rshaik\\Desktop\\rasool.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		
		XSSFSheet ws= wb.getSheetAt(0);
		ws.getRow(1).createCell(2).setCellValue("Pass");
		ws.getRow(2).createCell(2).setCellValue("Fail");
		
		FileOutputStream fos= new FileOutputStream(src);
		wb.write(fos);
wb.close();		

	}

}
