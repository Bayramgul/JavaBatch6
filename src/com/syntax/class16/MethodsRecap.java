package com.syntax.class16;

public class MethodsRecap {

	public static void main(String[] args) {
		MethodsRecap obj=new MethodsRecap();
		int []arr= {18,90,89,78};
		System.out.println(obj.getMax(arr));
		System.out.println(obj.word(""));
		
	}
	int getMax(int [] array) {
	int largest=array[0];
	
	for (int i=1; i<array.length;i++) {
		if(array[i]>largest) {
			largest=array[i];
		}
	}return largest;
}
	//create a method that will accept a String and return each word form a given String
	
	String [] word(String str) {
		String [] array=str.split(" ");
		
		return array;
	}
}
