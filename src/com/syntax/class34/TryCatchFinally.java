package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {

	
public static void division (int num,int num1 ) {
	try {
		System.out.println(num/num1);//new ArithmeticException will be created and thrown in case divided by 0
	}catch(ArithmeticException ae) {
		ae.printStackTrace();//detailed message of an exception
		System.out.println(ae.getMessage());//message of an exception
		System.out.println(ae);
	}
		finally {
		System.out.println("I am a finally block");
	}
}
public static void read(String filePath) {
	FileInputStream fis=null;
	try{
		fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(fis!=null) {
				fis.close();	
			}
		}
	catch(IOException e) {
		
	}}
}
}
