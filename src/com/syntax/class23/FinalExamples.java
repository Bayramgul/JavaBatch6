package com.syntax.class23;

public  class FinalExamples {
	final String str="I love Java";
	final void say() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		FinalExamples obj=new FinalExamples();
		//obj.str="I don't like Java"; CE:final cann not be modified
	}
}
