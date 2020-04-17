package com.syntax.class21;

public class ProgrammingLanguage {
	String name, variable;
	ProgrammingLanguage pr=new ProgrammingLanguage ();
	//this.name=name;
	//this.variable=variable;
}
class Java extends ProgrammingLanguage{
	String constructor;
	Java (String constructor){
		this.constructor=constructor;
	}
	
	 public void details() {
		System.out.println(name+" can have variables "+ variable+ " and "+ constructor + "+ constructor");
	}
	
}
class JavaScript extends ProgrammingLanguage{
	public void details() {
		System.out.println(name+" can have variables "+ variable);
	}
}