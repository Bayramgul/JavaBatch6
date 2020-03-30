package com.syntax.repl;

public class R125 {
	static String mixString(String s1, String s2){
		String mix="";
		 // 1st way
		for(int a=0;a<s1.length();a++) {
			mix=mix+s1.charAt(a)+s2.charAt(a);//concatenation of string characters
		}// mix+=s1.charAt(a)+s2.charAt(a);--> prints 208212227208232 ; 
		 //2nd way
//		 String [] stw =s1.split("");
//		 String [] st=s2.split("");
//		 for(int i=0;i<stw.length;i++){
//			 for( int j=i;j<st.length;j++) {
//				 mix+=stw[i]+st[j]; // concatenation of string characters
//				 break;
//			 }
//		 }
//		 System.out.println("// 3rd way");
//		 char []c1=s1.toCharArray();
//		 char[] c2=s2.toCharArray();
//		  
//		 for(int i=0;i<c1.length;i++){
//			  mix=mix+c1[i]+c2[i];// concatenation of char characters
//			// mix+=c1[i]+c2[i];-->same printing issue with 1st way   
//			  
//			 }
//		  
		 return mix;
		}
		//test case below (don't change):
		public static void main(String[] args){
		 String firstValue = mixString("12345","abcde"); 
		System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
			
			
			
}
}


