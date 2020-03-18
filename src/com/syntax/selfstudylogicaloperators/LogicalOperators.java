package com.syntax.selfstudylogicaloperators;

public class LogicalOperators {

	public static void main(String[] args) {
		int quiz=80;
		int midTerm=88;
		int finalExam=90;
		int average=(quiz+midTerm+finalExam)/3;
		if (average>=90) {
			System.out.println("Grade A");
		}
		if (average>=90 && average<=70) {
			System.out.println("Grade B");
			
		}if (average<70&& average>=50) {
			System.out.println("Grade C");
		}
	}

}
