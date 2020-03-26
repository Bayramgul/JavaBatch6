package com.syntax.class17;

public class Task3 {

	public static void main(String[] args) {
		// Create a method that will accept a String as a parameter and return a new
		// String that consist only of vowels. Method should be available inside the
		// class where it was declared and executed by calling it is name.
		
		System.out.println(Task3.vowels("I am coding now"));
		
	}
		private static String vowels(String st) {
			
			String vowel="";
			char []v=st.toCharArray();
			for(int i=0;i<v.length;i++) {
				if(v[i]=='e'||v[i]=='u'||v[i]=='i'||v[i]=='o'||v[i]=='a') {
					vowel+=v[i];
				}
			}
			
			
			return vowel;
			
		}
}
