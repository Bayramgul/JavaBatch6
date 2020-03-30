package com.syntax.class19;

public class Student {
	/*
	 * Write program as a Student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method.
	 * 
	 */
	String name;
	String address;
	Student(String name, String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println(name + " lives in "+address+" address");
	}

	public static void main(String[] args) {
		Student std=new Student("John","1234 Distric ave");
		std.displayInfo();
	}

}
