package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		//using nested loop we wnna print 10-99
		for (int i=1;i<=9;i++) {
			for(int j=0;j<=9;j++)
			System.out.println(i+""+j);//must put double quotes otherwise it will take it as a sum,now it is a string concatination
			
		}
		int minIncrease=0;
		for(int hour=0;hour<=23;hour++) {
			for(int min=0;min<=59;min++) 
			{if (min<10) {System.out.println(hour+ " : 0"+min);
				
			}else {
				System.out.println(hour+" : "+min);
			}
				
			}
		}
		
	}

}
