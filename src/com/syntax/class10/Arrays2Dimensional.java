package com.syntax.class10;

public class Arrays2Dimensional {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4];
		// 1 row
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;
		// 2 row
		numbers[1][0] = 5;
		numbers[1][1] = 10;
		numbers[1][2] = 15;
		numbers[1][3] = 20;
		// 3 row
		numbers[2][0] = 1;
		numbers[2][1] = 2;
		numbers[2][2] = 3;
		numbers[2][3] = 4;
		System.out.println(numbers[1][2]);

		int[][] nums = { // array of 3 single dimensional arrays
				{ 10, 20, 30, 40 }, 
				{ 5, 10, 15, 20 }, 
				{ 1, 2, 3, 4 } };
		// print 4
		System.out.println(nums[2][3]);
		//print  30
		System.out.println(nums[0][3]);
		
		String [][] month= {{"Jan","Feb","Dec"},
				           {"MArch","April","May"},
				           {"June","July","Aug"},
				           {"Sept","Oct","Nov"}
		};
		for(int row=0; row<month.length;row++) {// outer loop gives me the num of rows
		for(int col=0;col<month[row].length; col++) {//for columns. IMPORTANT always number of columns should be less than num of rows
				
				System.out.print(month[row][col]+" ");// tells the address of each element and prints the value
			}//code must be inside of inner loop
			System.out.println();//must be outside of inner loop
		}
		
		int rows=month.length; // how many rows
		int Array=month[1].length;//how many elements in a row
		

	}

}
