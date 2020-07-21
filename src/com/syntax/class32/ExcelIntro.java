package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		String filePath = "/Users/Bayramgul/Desktop/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		// accessong workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// accessing sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// accessing row
		Row row1 = sheet.getRow(0);
		// accessing cell
		Cell cell = row1.getCell(1);
		// get value from cell
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);
		Row row2 = sheet.getRow(2);
		Cell r2c2 = row2.getCell(2);
		String cellValue = r2c2.toString();
		System.out.println(cellValue);
		// access Va
		String c3r3 = sheet.getRow(1).getCell(3).toString();
		System.out.println(c3r3);
		// to retrieve values based on type
		double cellv = sheet.getRow(1).getCell(4).getNumericCellValue();
		int cell1 = (int) cellv;
		System.out.println(cellv);
		// how to get 20151 in String format
		String valC = sheet.getRow(1).getCell(4).toString();
		String[] arr = valC.split("\\.");
		System.out.println(arr[0]);

	}

}
