package com.syntax.class11;

public class EnhancedLoop {

	public static void main(String[] args) {
		String[][] groceries={
                {"cucumber","potato", "carrot"},
                {"mango", "apple", "banana", "kiwi"},
                {"milk", "cheese", "yogurt"}
                };
		
		for(String [] a:groceries) {
			for(String b:a) {
				System.out.println(b);
			}
		}

	}

}
