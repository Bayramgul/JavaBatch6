package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {
   //print 12345 for 4 rows
		for (int i=1;i<=4;i++) {//outer loop is number of iterations I want to execute the code inside of inner loop
			for (int j=1;j<=5;j++) {
				System.out.print(j);//to SOP j  means it will print j for i times :)))
									////to SOP i  means it will print i for i times :)))
			}
			System.out.println();
		}
		
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=9;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//print  54321 for 5 rows
		for (int i=1;i<=5;i++) {
			for (int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		//
		for (int i=5;i>=1;i--) {
			for (int j=5;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		 for(int r=1;r<=4;r++) {//whenever you create triangle pattern column size always should less than column size
			 for (int c=1; c<=r;c++) {//IMPORTANT :number of columns never should exceed the number of rows
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=1; i<=5;i++) {
			 for(int j=1;j<i;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 
			
	}

}
