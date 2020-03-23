package com.syntax.repl;

public class Repl112 {

	
		public static boolean  bothEven(int num1,int num2)
		{
			boolean even;
			if(num1%2==0 && num2%2==0){
			 // return true; 
				even=true;
			 } else{
			   //return  false;
				 even=false;
			 }
			return even;
		}
		
		//test case below (don't change):
		public static void main(String[] args){
			
			System.out.println(bothEven(2,4)); //should be false
		}
	}


