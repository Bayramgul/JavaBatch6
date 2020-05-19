package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);//in case exception occurs, obj of InterruptedException will be created, e is name of instance variable 
		}catch(InterruptedException e) {
			System.out.println("Catched InterruptedException  exception");
		}
		System.out.println("Continue to next try block");
		String fpath="";
		try {
			FileInputStream fis=new FileInputStream(fpath);
		}catch(FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundException exception");
		}
		System.out.println("Continue to next try block");
		int a=10;
		int b=0;
		try{
			System.out.println("I am inside try block");
			System.out.println(a/b);//new ArithmeticException
			
		}catch(ArithmeticException ae) {
			System.out.println("Catched ArithmeticException exception");
		}
		System.out.println("End of the program ");
		
	}

}
