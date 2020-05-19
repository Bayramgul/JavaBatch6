package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	public static void main(String[] args) throws FileNotFoundException {
		String str;
		int a=10;
		int b=0;
		//System.out.println(a/b);-->we will get ArithmeticException
		System.out.println("End of the program");
		int[]array= {12,1,13};
		//System.out.println(array[3]);-> ArrayOutOfBoundException
		//System.out.println(str.length());//NullPointerExceptio
		String filePath="";
		NullPointerException npe = new NullPointerException();
		throw(npe);
		//Thread.sleep(2000);
		//FileInputStream fis=new FileInputStream(filePath);
		
	}

}
