package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Task {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>();
		students.add(new Student("Samir", 101));
		students.add(new Student("Karim", 102));
		students.add(new Student("John", 103));
		students.add(new Student("Jane", 104));
		students.add(new Student("Khan", 105));
		students.add(new Student("Tariq", 106));
		students.add(new Student("Ahmed", 107));
		students.add(new Student("Samir",101));
		
		Iterator <Student> student = students.iterator();
		
		while(student.hasNext()) {
			student.next().getName();
		}
		
	}

}
