package com.syntax.class18;

public class Shirt {

	
	private String color;
	private char size;
	
	Shirt (){
		this(1);// we can call other constructor inside of the constructor by passing the value of that constructor,must be in 1 line of this though
		System.out.println("First constructor is running");
		
	}
	Shirt (String color, char size){
		this.color=color;
		this.size=size;
		System.out.println("I want shirt with color "+color+" and size "+size);
	}
	Shirt(int num){
		System.out.println("This is third constructor ");
	}
	
	static void putOn() {
		System.out.println("The shirt is on ");
	}

	static void putOff() {
		System.out.println("The shirt is off");
	}

	public static void main(String[] args) {
		// 1)constructors create an object, 2)default constructor when u create obj 3) calls the Shirt method if it is created in the other class 
		Shirt shirt1=new Shirt("White",'M');// finds which Shirt method it is by matching parameters
		putOn();//static way of calling static method 
		shirt1.putOff();// non static way of calling static method
		new Shirt();
		new Shirt(3);
		new Shirt("Yellow",'S');// calling Shirt method, it automatically finds it by matching the parameter values
	}

}
