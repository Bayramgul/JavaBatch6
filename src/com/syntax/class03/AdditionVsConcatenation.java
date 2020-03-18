package com.syntax.class03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		String x="Hello";
		String y="Bye";
		// whenever you have String in the beginning the rest will as a concatenation to string but when you have number at the beginning 
		//then it will be addition of two numbers. 
		System.out.println(a+b+x+y);//30HelloBye
		System.out.println(a+x+b+y);//10Hello20Bye
		System.out.println(x+y+a+b);//HelloBye1020
		System.out.println(x+y+(a+b));//HelloBye30
		System.out.println(a+""+b+x+y);
		System.out.print(a+b+x+y);
	}

}
