package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	///Users/Bayramgul/eclipse-workspace/JavaBasics/TestData/Info.xlsx
	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		//writing into existing sheet
		Sheet sheet1=book.getSheet("Sheet1");
		sheet1.getRow(0).createCell(5).setCellValue("Country");//
		sheet1.createRow(3).createCell(0).setCellValue("Hichem");//create new row if there isn't
		book.createSheet("TestSheet");
		FileOutputStream fos=new FileOutputStream(filePath);
		book.write(fos);//this is must for pushing/writing data
	}

}
