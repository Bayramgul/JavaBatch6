package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		String str="Good Morning Students";
		char letter1=str.charAt(0);//gives the charcater at index 0;
		char letters;
		int sum=0;
		for(int i=0; i<str.length();i++) {
			letters=str.charAt(i);
			System.out.print(letters+" ");
		}
			
		System.out.println(" ------------- index of () FUNCTION");
			String name="Syntax Technologies";
			
			System.out.println();
		
	 int index=str.charAt(0);
	 index=name.indexOf("o");
	 System.out.println(index);
	 
	 index = name.indexOf("o", (13));
		System.out.println(index);
		
	}

}
