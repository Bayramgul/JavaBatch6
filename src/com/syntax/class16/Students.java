package com.syntax.class16;

public class Students {
	String studentName;
	int studentID;
	int numberOfStudents;
	public static void main(String[] args) {
		// Create a Class called Students
		// Create three variables studentName , studentID and numberOfStudents
		// Create three objects of the Students Class
		// Set the value for studentName , studentID and increment the numberOfStudents
		// for each object
		// Print out total number of students
		Students st1=new Students();
		st1.studentName="Julia";
		st1.studentID=123;
		st1.numberOfStudents=01;
		
		
		Students st2=new Students();
		st2.studentName="Adrian";
		st2.studentID=456;
		st2.numberOfStudents=02;
		
		
		Students st3=new Students();
		st3.studentName="Anna";
		st3.studentID=789;
		st3.numberOfStudents=03;
		System.out.println(" the number of total students is "+st1.numberOfStudents+st2.numberOfStudents+st3.numberOfStudents);
		
	}

}
