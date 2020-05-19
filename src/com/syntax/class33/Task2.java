package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.

 */

public class Task2 {
	
	public static List<Exception> exception(){
		List<Exception> list=new ArrayList<>();
		String str="hello";
		//1 obj of exception type
		try{
			char character=str.charAt(10);//new StringIndexOutOfBoundsException()
			System.out.println(character);
		}catch(StringIndexOutOfBoundsException se) {
			list.add(se);
			System.out.println(se);
			System.out.println(se.getMessage());
		}
		int a=10;
		int b=0;
		//2 obj of exception type
		try{
			
			System.out.println(a/b);//new ArithmeticException
			
		}catch(ArithmeticException ae) {
			list.add(ae);
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		int [] nums= {1,3,4,5};
		//3 obj of exception type
		try{
		
			System.out.println(nums[10]);
		}catch(Exception ou){
			list.add(ou);
			System.out.println(ou);
			System.out.println(ou.getMessage());
		}
		String fpath="";
		//4 obj of exception type
		try {
			FileInputStream fis=new FileInputStream(fpath);
		}catch(FileNotFoundException fne) {
			System.out.println(fne);
		}
		
		return list;
	}

	public static void main(String[] args) {
		List<Exception>list=exception();
		list.size();
		Iterator<Exception> eit=list.iterator();
		while(eit.hasNext()) {
			Exception e=eit.next();
			System.out.println(e.getMessage());
		}
	}

}
