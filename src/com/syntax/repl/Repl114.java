package com.syntax.repl;

public class Repl114 {

	public static void main(String[] args) {
		
		Repl114 obj=new Repl114();
		System.out.println(obj.spaceOut("hello"));
	}

	String spaceOut(String s) {
		String text = "";
		for (int i = 0; i < s.length(); i++) {
			text += s.charAt(i) + " ";
		}
		return text;
	}
}
