package com.syntax.class29;

public class Student {
String name;
int Id;
Student(String name, int Id){
	this.name=name;
	this.Id=Id;
}
public void getName() {
	System.out.println("Student name is "+name);
}
}
