package com.syntax.class16;

public class Employee {
	int eId;
	double salary;
	static String CEO="Sumair";

	public static void main(String[] args) {
		/*
		 * Create a Class called Employee: Create three variables eID , salary and set
		 * the CEO to “Sumair”. Create two objects of the class Employee Set the value of
		 * eID, salary for each of the objects Print out the eID , salary and CEO for
		 * each of the objects
		 */
		Employee obj1=new Employee();
		obj1.eId=123456;
		obj1.salary=2000000.00; 
		
		Employee obj2=new Employee();
		obj2.eId=123456678;
		obj2.salary=1000000.00; 
		
		System.out.println(obj1.eId);
		System.out.println(obj1.salary);
		System.out.println(Employee.CEO);
		
		System.out.println(obj2.eId);
		System.out.println(obj2.salary);
		System.out.println(obj2.CEO);
	}

}
