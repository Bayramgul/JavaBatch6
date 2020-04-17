package com.syntax.class22;

public class OverloadingMAin {

	public static void main(String[] args) {// Java always looks for main method with this signature
		System.out.println("Method with String array arguments");
		OverloadingMAin.main(3);
		OverloadingMAin.main("hi");
		OverloadingMAin.main("abc","dfg");
		//int [] arr=new int[2];
		main(new String[2]);// same thing: calling static method inside of same class,which has  array of Strings.1)method name(parameter type)
	}

	public static void main(String args) {
		System.out.println("Method with String arguments");

	}
	public static void main(int args) {
		System.out.println("Method with int arguments");

	}
	public static void main(String args, String args1) {
		System.out.println("Method with 2 String  arguments");

	}
}
