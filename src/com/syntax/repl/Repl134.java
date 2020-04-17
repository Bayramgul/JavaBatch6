package com.syntax.repl;

public class Repl134 {
	protected static String maxLength(String[] arr) {
		// Create the maxLength method that will accept String array of words and return
		// the word with the largest length.
		String str = "";
		String str1="";
		int largest = arr[0].length();// number of letters of 1st word in arr
		for (int i = 0; i < arr.length; i++) {
			str = arr[i];

			if (arr[i].length() > largest) {
				largest = arr[i].length();// number who has largest number of letters
			}
		}
		for (int j = 0; j < largest; j++) {
			str1+= str.charAt(j);
		}
		return str1;
	}

	public static void main(String[] args) {

		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
		// int largest=arr[0].length();
		// String str="";
//		for(int i=0; i<arr.length;i++) {
//			 //str=arr[i];
//			 
//			 if(arr[i].length()>largest) {
//				 largest=arr[i].length();// number who has largest number of letters 
//				 System.out.println(arr[largest-1]);
//			 }
//			 
		// }

	}

}
