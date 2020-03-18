package com.syntax.class11;

public class MoreExamples2D {

	public static void main(String[] args) {
		String[][]professions= {{"Tester","Devs","Po","Scrum master"},
								{"math teacher", "science teacher","ESL teach"},
								{"dentist","surgeon"}};
		
		for(String[] pro:professions) {
			for(String p:pro) {
				System.out.print(p+" , ");
			}System.out.println();
		}
	}

}
