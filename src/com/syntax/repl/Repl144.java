package com.syntax.repl;

public class Repl144 {
	public static void main(String[] args) {
		// At Employee, Student, Retiree Class have a print method in each that prints
		// the properties in line as shown in the output
		// Joe Smith 35 35000
		// Adam Smith 15 10
		// Frank Smith 15 tour
		
		Employee emp=new Employee();
		emp.age=35;
		emp.lastName="Smith";
		emp.name="Joe";
		emp.salary=35000;
		emp.employeeInfo();
		
		Student st=new Student();
		st.name="Adam";
		//st.lastName="Smith"; i dont have to assign value if itis static
		st.age=15;
		st.grade=10;
		st.studentInfo();
		
		Retiree ret=new Retiree();
		ret.name="Frank";
		//ret.lastName="Smith";
		ret.seniorActivity="15 tour";
		ret.retiredInfo();
		
	}

}

class Person {
	String name;
	static String lastName;
	int age;
}

class Employee extends Person {
	int salary;

	public void employeeInfo() {
		System.out.println(name + " " + lastName + " " + age + " " + salary);
	}
}

class Student extends Employee {
	int grade;

	public void studentInfo() {
		System.out.println(name + " " + lastName + " " + age + " " + grade);
	}
}

class Retiree extends Student {
	String seniorActivity;
	public void retiredInfo() {
		System.out.println(name + " " + lastName + " "+seniorActivity);
	}

}