package com.syntax.class22;

public class Degree {
	// Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To
	// get a degree you need high school diploma”“.
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}
class BAchelors extends Degree{
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma and dedication");
	}
}
 class Masters extends Degree{
	
}