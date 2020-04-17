package com.syntax.class19;

public class ThisKeyword {
	
	int a;
	int b;
	public  ThisKeyword(int a,int b) {
		this.a=a;// this refers to instance variable and assigns to local variables inside parameters
		this.b=b;
		
	}
	 ThisKeyword(){
		 System.out.println("I am non argumet constructor");
	 }
	public void sum(int a,int b) {
		System.out.println("Sum of local variables "+(a+b));// we give value when we call method by object of this class under main method
		System.out.println("Sum of instance variables "+(this.a+this.b));// pass the value of current instance variable
	}
	public static void main(String[] args) {
		ThisKeyword obj1=new ThisKeyword(10,20);
		obj1.sum(100,200);// this is for the method and assigning value for local variables of that method
		
		System.out.println("---------------");
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20, 40);
	}
}
