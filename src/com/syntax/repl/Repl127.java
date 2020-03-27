package com.syntax.repl;
//count the number of occurrences of 'a' or 'A' within s
public class Repl127 {
	static int countA (String a){
	char [] b=a.toCharArray();
	int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]=='a'||b[i]=='A') {
				count++;
			}
		}
		

		
		return count;
	
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}

}
