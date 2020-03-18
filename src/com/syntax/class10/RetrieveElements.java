package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		// getting all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);// prints all elements in the array
		}
		System.out.println("-----printing using advanced for loop----");
		// Advanced for Loop/Enhanced for Loop//for each LOOp

		for (char element : grades) {// inside of element i have collection of elements inside grades array
			// for(1.declare data type 2.give name for collection name 3. name of an array
			// which i want to retrieve elements from)
			System.out.println(element);
		}
		// 1 way. using advanced loop
		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit + "is your favorite fruit");
			} else {
				System.out.println(fruit);
			}
		}
		// 2 way. using regular for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
	}

}
