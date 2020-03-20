package com.syntax.interviewQuestions;

public class Q7 {

	public static void main(String[] args) {
		// T// Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
        int [] arr = { 20, 80, 30, 40, 10, 50, 6};
        
        int maxNum=arr[0];
        int secondLargestNum=arr[0];
        int minNum=arr[0];
        
        
        for (int a : arr) {
            if (a>maxNum) {
                maxNum=a;
                if (a>secondLargestNum ) {
                    secondLargestNum=maxNum;
                    maxNum=a;
                }
            } else if (a<minNum) {
                minNum=a;
            }
        }
        
        for (int a : arr) {
        	System.out.println("All elements"+a);
            
        }
        
        
        System.out.println("Max num of arr array is "+maxNum);
        System.out.println("Min num of arr array is "+minNum);
        System.out.println("Second largest num of arr array is "+secondLargestNum);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    



	}

}
