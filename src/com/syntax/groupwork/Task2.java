package com.syntax.groupwork;

public class Task2 {
	/*
	 * We have to calculate the average of marks obtained in three subjects by
	 * student A and by student B. Create class ‘Marks’ with an abstract method
	 * ‘getPercentage’ that will be returning the average percentage of marks.
	 * Provide implementation of abstract method in classes ‘A’ and ‘B’. The
	 * constructor of student A takes the marks in three subjects as its parameters
	 * and the marks in four subjects as its parameters for student B. Test your
	 * code
	 * 
	 */

}

abstract class Marks {

	abstract double getPercentage();
}

class StudentA extends Marks {
	int sub1, sub2, sub3;

	StudentA(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	@Override
	double getPercentage() {

		double ave = (sub1 + sub2 + sub3) / 3;
		
		return ave;
	}

}
class StudentB extends Marks{
	int s1,s2,s3,s4;
	StudentB(int s1,int s2,int s3,int s4){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	
	
	@Override
	double getPercentage() {
		double ave=(s1+s2+s3+s4)/4;
		return ave;
	}
	
}