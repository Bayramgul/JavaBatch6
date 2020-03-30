package com.syntax.class18;

public class Car {
	String make,model,color;
	int year;
	public void printDetails() {
		System.out.println("I have "+ year+ " "+make+" "+ model+" in "+ color);
	}

	public static void main(String[] args) {
		 Car car= new Car();
		
		
		
		
		
		
		System.out.println("-----------------------");
		
		Car car1=new Car();
		System.out.println(car1.make);// if we run without assigning value, it will print default value
		//any obj type of variables, the all have default value
		//the GOAL of the constructor is to INITIALIZE the obj variable 
		
		int doors;
		//System.out.println(doors); ALL LOCAL variables must be initialized
	
		
		
	}

}
