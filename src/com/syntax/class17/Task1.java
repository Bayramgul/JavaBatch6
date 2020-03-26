package com.syntax.class17;

public class Task1 {

	
		// Create a method that will accept an array as parameters and will return a sum
		// of all elements from that array. Method should be visibly only within same
		// package and accessible by the creating an instance of the class.
		
		
	public static void main(String[] args) {
		Task1 obj=new Task1();
		int [] arr1= {1,2,3,4,5};
		System.out.println(obj.sum(arr1));
		
	}

	private  int sum (int num[]) {
		
		int sum=0;
		for(int i=0; i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
		
	
	}

}
