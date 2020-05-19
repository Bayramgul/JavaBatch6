package com.syntax.repl;
												//Throwable:Exception:checked:compiletime and unchecked:Runtime Exceptions(console) 
public class Repl206 {
//Complete the code, handle possible exception
	public static void main(String[] args) {
		 int a=10, b=0; int result;
		 
	     try{
	     result = a/b;}
	     catch(ArithmeticException ae){//exception name
	     System.out.println(ae.getMessage()); 
	     System.out.println(ae);
	     ae.printStackTrace();
	     }
	     System.out.println("The code continues");
	  }
	}


