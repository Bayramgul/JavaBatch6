package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		String file=System.getProperty("user.dir")+ "/config/privateinfo.properties";
		try{
			FileInputStream fis=new 	FileInputStream(file);//new FileNotFoundException
			fis.close();
			Properties prop=new Properties();
			prop.load(fis);//new IOException ()
			//with Exception we can catch multiple catch
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
System.out.println("--------END OF PROGRAM--------");
	}

}
