package com.syntax.class10;

public class ArraysRecap {

	public static void main(String[] args) {
		// how many elements stored inside an array
		String []cities= {"Washington","PAris","Miami","Chantilly", "LA"};
		int arraySize=cities.length; //tell the number of elements 
	System.out.println(arraySize);
	//how can we access last element from an array?
	System.out.println( cities[arraySize-1]);
	
	// access all elements from an array
	for (int i=0;i<arraySize;i++) {
		System.out.println(cities[i]);
	}
	
	
	
		
	}
	

}
