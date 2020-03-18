package com.syntax.class02;

public class IfStatement {
	
	public static void main(String[] args) {
		int day =34;
		//if the statement is true then will execute the following code, if not correct then will execute whichever statement is true.
		//if none of the conditions is true then nothing will happen in the console
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else if(day!=7) {
			System.out.println("Invalid information");
			
		}
		
	}

}
