package com.syntax.class19;

public class Teacher {
	// Write a Java program called Teacher. Identify features and behavior of that
	// Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	// that would have it their own features and behavior. Test all 4 classes
	
	 String name, subject;
	 int studentNum;
	 int workExperience;
	 
	public void displayInfo() {
		
		System.out.println(name + " is "+ subject+ " teacher with "+ workExperience+ " years of experience");
	}
}
