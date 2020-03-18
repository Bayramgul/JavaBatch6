package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		String[]students=new String[3];
		//arrays are fixed in size
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		// students[3]="Aoron";--->during run time java machine will give error, out of the bound
		String []inClassStudents=new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		System.out.println(inClassStudents[2]);// it will print null bcuz we didn't assign a value
		
		
	}

}
