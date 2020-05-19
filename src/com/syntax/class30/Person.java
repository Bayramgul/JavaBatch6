package com.syntax.class30;

public class Person {
	/*
	 * Create a Person class with following private fields: name, lastName, age,
	 * salary.
	 * Variables should be initialized through constructor. Inside the class also
	 * create a method to print user details. In Test Class create a Map that will
	 * store key in ascending order. In that map store personId and a Person Object.
	 * Print each object details.
	 */
	private String name,lastname;
	private int age;
	private double salary;
	Person( String name,String lastname, int age,double salary){
		this.name=name;
		this.lastname=lastname;
		this.age=age;
		this.salary=salary;
	}
	public void displayInfo() {
		System.out.println(name+" "+lastname+ " is "+age+ " years old and earns "+salary);
	}

}
