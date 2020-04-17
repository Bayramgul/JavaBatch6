package com.syntax.class22;

public class Employee {
	double salary;

	void getPaid() {
		System.out.println("Employee gets paid " + salary);
	}

	void Work() {
		System.out.println("Employee works");
	}

}

class Contractor extends Employee {
	double hourlyRate;

	void getPaid() {
		System.out.println("Employee gets paid " + hourlyRate);
	}
}

class FullTime extends Employee {
	void getPaid() {
		System.out.println("Employee gets paid " + salary);
	}
}

class PartTime extends Employee {

}