package com.syntax.class18;

public class Students {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. NOTE: please use
	 * different names for instance and local variables.
	 */
	 String name1; 
	int sub1,sub2,sub3;int ave;
	Students(String n1,int s1,int s2,int s3){
		name1=n1; sub1=s1;sub2=s2;sub3=s3;
		
		
	}public int Average(){
		int ave=(sub1+sub2+sub3)/3;
		return ave;
	}
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

