package com.syntax.repl;

public class R136SyntaxTechnologies {
	String schoolName, lastDayOfClass;
	int batch,year;
	  R136SyntaxTechnologies(){
		  this.schoolName=schoolName;
		    this.year=year;
		    this.lastDayOfClass=lastDayOfClass;
		    this.batch=batch;
	    System.out.println(schoolName+ " "+batch +" "+year+" " + lastDayOfClass);
	  }
	  R136SyntaxTechnologies(String schoolName,int batch,int year, String lastDayOfClass){
	    this.schoolName=schoolName;
	    this.year=year;
	    this.lastDayOfClass=lastDayOfClass;
	    this.batch=batch;
	  }
	  void display() {
		  System.out.println(this.schoolName+ " "+this.batch +" "+this.year+" " + this.lastDayOfClass);
		  
	  }
	  
}
