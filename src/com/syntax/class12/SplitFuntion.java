package com.syntax.class12;

public class SplitFuntion {

	public static void main(String[] args) {
		String today="Today is my favorite Java class";
		
		String []array=today.split("my");//after split string becomes array
		System.out.println(array.length);// prints num of elements in array
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite java class.";
		String []stringArray=today1.split("a");//we created array by spliting
		for(String arr:stringArray) {
			System.out.print(arr+" ");
		}System.out.println(stringArray.length);
		
		//we want to print string word by word
		String today2="Today is my favorite java class.";
		
		String [] words=today2.split(" ");//split by space to split words 
		for(int i=0;i<words.length;i++) {//prints all words 
			System.out.println(words[i]);
			
			
		}
		
	}

}
