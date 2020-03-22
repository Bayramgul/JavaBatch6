package com.syntax.class15;

public class Larger {// void just performs logic but wont give you sth to strore
	void compare(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is the larger than " + num2);
		} else {
			System.out.println(num2 + " is the larger than " + num1);
		}
	}

	void evenOrOdd(int n1) {
		if (n1 % 2 == 0) {
			System.out.println(n1 + " is even number");
		} else {
			System.out.println(n1 + " is odd number");
		}
	}

	void Palindrome(String word) {
		String rev="";
		char[] words=word.toCharArray();
		for(int i=word.length()-1;i>=0;i-- ) {
			rev+=words[i];
			
		}
		System.out.println(rev);
		if(word.equals(rev)) {
			System.out.println(word +" is a palindrome");
		}else {
			System.out.println("This word is not a palindrome");
		}
		
	}

	
	
}
