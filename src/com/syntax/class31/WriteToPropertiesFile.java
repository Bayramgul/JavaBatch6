package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// write into existing file 
		String filePath="/Users/Bayramgul/eclipse-workspace/JavaBasics/Examples.properties";
		//FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
	//prop.load(fis);//just load once
	//if we don't load and setProperty it will be gone, and will be rewritten
	prop.setProperty("PhoneNumber", "123456789");
	
	FileOutputStream fos=new FileOutputStream(filePath);
	prop.store(fos, "Added additional key");
	
	}

}
