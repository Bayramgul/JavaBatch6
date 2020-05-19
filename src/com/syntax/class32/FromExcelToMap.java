package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		//writing into existing sheet
		Sheet sheet1=book.getSheet("Sheet1");
		int row=sheet1.getPhysicalNumberOfRows();
		int col=sheet1.getRow(0).getLastCellNum();
		List<Map<String,String>> listMap=new ArrayList<>();
		for(int r=1;r<row;r++) {// outer loop for keys
			Map<String,String> map=new LinkedHashMap<>();
	
			for(int c=0;c<col;c++) {//inner loop for values
				
				String key=sheet1.getRow(0).getCell(c).toString();//always keys are on the row 0,this is fixed formula for MAP key,	//set keys
				String value=sheet1.getRow(r).getCell(c).toString();//this is one string, set value
				map.put(key, value);//this is one element of map
			}
			listMap.add(map);//adding map to the ArrayList with map argument
		}
		System.out.println(listMap);
	}

}
