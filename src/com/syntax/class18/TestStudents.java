package com.syntax.class18;

public class TestStudents {

	public static void main(String[] args) {
		Students st1=new Students("John",80,90,70);
		Students st2=new Students("Smith",89,9,70);
		Students st3=new Students("Kate",85,98,70);
		Students st4=new Students("Bryan",80,97,50);
		System.out.println(st1.name1+ " got average grade of "+st1.Average());
		System.out.println(st2.name1+ " got average grade of "+st2.Average());
		System.out.println(st3.name1+ " got average grade of "+st3.Average());
		System.out.println(st4.name1+ " got average grade of "+st4.Average());
	}

}
