package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String filePath="/Users/Bayramgul/Desktop/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		// get an object of workbook type
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		//need to find numbers of rows
		int rows=sheet.getPhysicalNumberOfRows();
		//find number of columns
		
		int colls=sheet.getRow(0).getLastCellNum();
		//get values from all rows and columns
		for(int r=0; r<rows;r++) {//iterate over rows
			for(int c=0;c<colls;c++) {
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
		}
		
	}

}
