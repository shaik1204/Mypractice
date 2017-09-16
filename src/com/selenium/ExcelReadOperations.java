package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperations {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		File src = new File("C:\\Users\\Rshaik\\Desktop\\rasool.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet worksheet = workbook.getSheetAt(0);
		/*Row row = worksheet.getRow(0);
		Cell cell=row.getCell(1);
		System.out.println(cell);
		
		String stg= cell.getStringCellValue();
		System.out.println(stg);*/
	
		
		// getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
	
		int rcnt = worksheet.getLastRowNum();
		

		for (int i = 0; i <rcnt; i++) {

			// System.out.println(i);

			String data = worksheet.getRow(i).getCell(0).getStringCellValue();
			String data1 = worksheet.getRow(i).getCell(1).getStringCellValue();
			//String data2 = worksheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data + "" + data1);

		}

	}

}
