package com.syntax.class06;

public class Arrays {

	public static void main(String[] args) {
		//declare an array and initialize it and store values
		int[]array=new int[4];//[4]number of elements when initializing
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[2]=40;
		//access elements from an array
		System.out.println(array[1]);
		
				
		  //second way : 
				String [] carArray;
				//String carArray1[]; both is possible
				carArray=new String[3];//n of elements
				carArray[0]="BMW";
				carArray[1]="Honda";
				carArray[2]="Toyota";
				System.out.println("I am driving "+carArray[2]);
		//////////////////////////
				int []number=new int[3];
				number[0]=100;
				number[1]=200;
				number[2]=300;
				
				number[1]=2000;//reassigning the variable, change the value
				System.out.println(number[1]+number[0]);
		
	}

}
