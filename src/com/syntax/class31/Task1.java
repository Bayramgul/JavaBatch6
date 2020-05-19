package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/Bayramgul/eclipse-workspace/JavaBasics/privateinfo.properties";
		FileInputStream fileInput=new FileInputStream(filePath);
		Properties prop=new Properties();
		
		prop.load(fileInput);//building stream is must to read 
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println("-----Extra info about System. class --------------");
		String userDirectory=System.getProperty("user.dir");//using system method to get the path
		System.out.println(userDirectory);
		String filePath1=userDirectory+"privateinfo.properties";
		String username=System.getProperty("user.name");//System class is working with the system i use, my com for ex. and will give info about my system
		System.out.println(username);
		
		//use values from properties file to write selenium code
		
	}

}
