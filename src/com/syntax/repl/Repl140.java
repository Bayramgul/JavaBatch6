package com.syntax.repl;

public class Repl140 {
	String name,lastName,startDate;
	  int employeeId,salary;
	 Repl140(){
	    this.name=name;this.lastName=lastName;this.startDate=startDate;this.employeeId=employeeId;this.salary=salary;
	  }
	 Repl140(String name,String lastName,int employeeId,String startDate,int salary
	  ){
	    this.name=name;this.lastName=lastName;this.startDate=startDate;this.employeeId=employeeId;this.salary=salary;
	  }
	 void info() {
		 System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	 }

	public static void main(String[] args) {
		Repl140 obj1=new Repl140();
		Repl140 obj2=new Repl140("Joe","Smith",12345,"01/01/1970",35000);
		obj1.info();
		obj2.info();
	}

}
