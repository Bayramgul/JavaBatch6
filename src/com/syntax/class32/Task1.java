package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {

	public static void main(String[] args) throws IOException {
		String filePath="/Users/Bayramgul/Desktop/Info.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		for(int r=0; r<rows;r++) {
			for(int c=0;c<col;c++) {
				String celVal=sheet.getRow(r).getCell(c).toString();
			System.out.print(celVal+"    ");
			}
			System.out.println();
		}
	}

}
