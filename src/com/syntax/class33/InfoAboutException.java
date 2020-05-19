package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		String str="hello";
		try{
			char character=str.charAt(10);//new StringIndexOutOfBoundsException()
			System.out.println(character);
		}catch(StringIndexOutOfBoundsException se) {
			//info about the exception
			//se.fillInStackTrace();//name, message about exception,where it occurs
			//System.out.println(se);
			System.out.println(se.getMessage());//getMessage() returns String
			
		}
		
	}

}
