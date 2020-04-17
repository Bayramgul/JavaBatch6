package com.syntax.repl;

public class Repl176 {

	public static void main(String[] args) {
		Persons obj=new Persons("John","Doe","10" ,"25" , "1900", "123-45-6789");
		System.out.println(obj.getName());
		System.out.println(obj.getLastname());
		System.out.println(obj.formatBirthday("10", "25", "1900"));
		System.out.println(obj.getSsn());
	
		
		
	}

}
