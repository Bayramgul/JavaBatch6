package com.syntax.interviewQuestions;

public class Question1SwapN {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?
		int x=10;
		int y=5;
		x=x+y;//sum of x  and y--->x:15
		y=x-y;//updated value of y--->15-5=10
		System.out.println("The value of y is:"+ y);//printing the value of updated y
		
		x=x-y;//15-new value of y(10)=5;
		System.out.println("The value of x is:"+x);
		
		String name="Tina";
		String name1="Fargol"; 
		name=name.concat(name1);//concatenate them to have both values
		name1=name.replace(name1, "");//we replcae not wanted string(name) with space to get name1
		System.out.println("The value of name1 is:"+ name1);
		name=name.replace(name1, "");
		System.out.println("The value of name is:"+ name);
	}

}
