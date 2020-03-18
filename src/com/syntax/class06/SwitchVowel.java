package com.syntax.class06;

public class SwitchVowel {

	public static void main(String[] args) {
		char ch = 'u';
		switch (ch) {
		case 'a':
		case 'o':
		case 'e':
		case 'u':
		case 'i':
			System.out.println("It is a vowel sound");
			break;
		
		default:
			System.out.println("It is a consonant sound");
		}
	}

}
