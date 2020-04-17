package com.syntax.class21;
// method overloading by changing number of parameters
 public class Addition {
	void add(int num, int num1) {
		System.out.println(num+num1);
		
	}
 void add(int num, int num1,int num2) {
	 System.out.println(num+num1+num2);
	}
 void add(int num, int num1, int num2,int num3) {
	 System.out.println(num+num1+num2+num3);
}
 
 //method overloading by changing data type of parameters
 void add(int num, double num1) {
		System.out.println(num+ num1);
	}
 void add(double num, double num1) {
		System.out.println(num+num1);
	}
}
