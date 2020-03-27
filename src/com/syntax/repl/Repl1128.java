package com.syntax.repl;

public class Repl1128 {
	static int countVowels(String s){
		  char[]t=s.toCharArray();
		int count=0;
		  for(int i=0;i<t.length;i++){
		  
		    if (t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'){
		      count++;
		    }
		  }
			return count;
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countVowels("obama")); //3
			System.out.println(countVowels("happy friday! i love weekends")); //9
		}

}
