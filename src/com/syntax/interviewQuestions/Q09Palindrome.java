package com.syntax.interviewQuestions;

public class Q09Palindrome {

	public static void main(String[] args) {
		/*
		 * Write a method which will return Boolean result for the below popular
		 * palindrome sentences and Test your code. popular palindrome sentences: 1.
		 * Eva, Can I Stab Bats In A Cave? 2. A Man, A Plan, A Canal-Panama! 3. Madam In
		 * Eden, I'm Adam 4. Mr. Owl Ate My Metal Worm 5. A Santa Lived As a Devil At
		 * NASA 6. Dammit, I'm Mad! 7. Was It A Rat I Saw? 8. Do Geese See God? 9. Never
		 * Odd Or Even. 10. Doc, Note: I Dissent. A Fast Never Prevents A Fatness. I
		 * Diet On Cod.
		 * 
		 */
		
		
		//str.replaceAll("[^A-Za-z]", "");
		Q09Palindrome obj=new Q09Palindrome();
		boolean output=obj.check("Eva, Can I Stab Bats In A Cave?");
		System.out.println("Is this sentence palindrome: "+ output);
	}
	boolean check(String str) {
		boolean check=true;
		str=str.replaceAll("[^A-Za-z]", "");
		
		char []c=str.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--) {
			rev+=c[i];
		}if(str.equalsIgnoreCase(rev)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
