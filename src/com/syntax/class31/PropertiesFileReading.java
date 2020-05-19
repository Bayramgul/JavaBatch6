package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// to read our file:
		//1.have file
		String filePath="/Users/Bayramgul/eclipse-workspace/JavaBasics/Examples.properties";
		//2.bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);//in the case there might me error finding file so add throw decleration
		// 3. to handle data from .properties file we need Properties class
		Properties prop=new Properties();// we need Properties class to work .properties files, so create its object
		//Property class extends Hashtable and acts like a map, data will be stored in a form of K,V and order wont be preserved
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		String city=prop.getProperty("city");
		System.out.println(city);
		Set<Object> keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
			
		}
	}

}
