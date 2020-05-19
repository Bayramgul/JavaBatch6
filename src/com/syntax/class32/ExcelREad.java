package com.syntax.class32;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelREad {

	public static void main(String[] args, HSSFWorkbook HSSFWorkbook) throws Exception {
		File exc=new File("/Users/Bayramgul/Desktop/MyFolders/Workbook1.xlsx");
		FileInputStream input=new FileInputStream(exc);
		HSSFWorkbook wb=new HSSFWorkbook(input); 
		HSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
