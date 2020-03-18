package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if declared number is 
		 * between 1-10-->this number is small
		 * between 11-100-->this number is big
		 * between 101-1000-->this is large number
		 */
		int num=178;
		if (num>=1 && num<=10) {System.out.println("this number is small");
			
		}else if (num>10 && num<+100) {System.out.println("this number is big");
			
		}else if (num>=100 && num<=1000) {
			System.out.println("this is large number");
		}
	}
	
	
}
