package com.syntax.class33;

import java.io.FileInputStream;
import java.util.Properties;

public class FinallyBlock {

	public static void main(String[] args) {
		String file=System.getProperty("user.dir")+ "/config/privateinfo.properties";
		try{
			FileInputStream fis=new 	FileInputStream(file);//new FileNotFoundException
			//fis.close();
//			Properties prop=new Properties();
//			prop.load(fis);//new IOException ()
			//with Exception we can catch multiple catch
		}catch(Exception e) {
			System.out.println("I am a catch block");
		}finally {
			System.out.println("I am a finally block");
		}
	}

}
