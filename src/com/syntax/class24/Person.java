package com.syntax.class24;

abstract public class Person {
  String name;
  int age;
  public void setData(String name, int age) {// i need to initialize it to use in methods later;
	  this.name=name;this.age=age;
  }
  abstract void display();
}
class Student extends Person{// if u dont implement the inherited abstract method it will give an error
	int rollNum=123;
	void display() {
		 System.out.printf(" Name: %s\t\n age: %d\t\n roll number: %d\n",name,age,rollNum);
	 }
	
}

