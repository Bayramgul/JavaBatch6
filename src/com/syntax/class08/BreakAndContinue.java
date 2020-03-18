package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		System.out.println("--------------CONTINUE-------------");
      for(int x=1;x<=10;x++) {
			
			if(x==4) {
				System.out.println("I am skipping loop");
				continue;
			}System.out.println(x);
			System.out.println("I am iside of the loop");
		}
		
		//write a program that print numbers from 1 to 20
      //I dont want to print 5,6,7
      System.out.println("-------------------- skipping");
      for (int y=1;y<21;y++) {if(y==5 || y==6||y==7) {
    	  continue;
      }System.out.println(y);
    	  
      }

		//write a program that print numbers from 1 to 100
    //I don't want to print 35-55
      for (int i=1;i<=100; i++) {
    	  if (i>=35 && i<=55) {
    		  continue;
    	  }System.out.println(i);
      }
      
	}

}
