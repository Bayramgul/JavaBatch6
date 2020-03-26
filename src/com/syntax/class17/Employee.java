package com.syntax.class17;

public class Employee {
	// create variables to hold: name, lastNAme,title,ssn
	public static  String title;
	  
	public String name;//accessible everywhere
	 protected String lastName;// accessible within same package
	double salary;// default- accessible within same package
	private long ssn;// accessible only within same class
	
	public static void method1() {
		System.out.println("I am public methpd");
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
   System.out.println("I am default method");
	}
	private void method4() {
		System.out.println("I am private method");
	}

}
