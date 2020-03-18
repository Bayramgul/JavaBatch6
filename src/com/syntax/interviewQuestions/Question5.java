package com.syntax.interviewQuestions;

public class Question5 {

	public static void main(String[] args) {
		//Write a java program to reverse String? Reverse a string word by word?
		String text="I love Java and coding!!! 123";
		for(int j=text.length()-1;j>=0;j--){
			System.out.print(text.charAt(j));//reverse by just characters
		}
		System.out.println();
		//String []array=text.replaceAll("[^A-Za-z\\s]","").split(" ");
		String []array=text.split(" ");
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);//reverse by words
		}
		
	}

}
