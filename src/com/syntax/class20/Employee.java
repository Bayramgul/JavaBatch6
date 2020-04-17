package com.syntax.class20;

 public class Employee {
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;//private members of class not available and they don participate inheritance
	void getPaid() {
		System.out.println("Employees are getting "+ salary);
		
	}
	static void work() {
		System.out.println("Employees are working at "+company);
	}
}
