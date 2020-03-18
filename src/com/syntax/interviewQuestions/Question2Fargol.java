package com.syntax.interviewQuestions;

public class Question2Fargol {

	public static void main(String[] args) {
		int num = 5;//this is the number we check
        boolean prime =true;//variable to check boolean condition
        for(int i = 2;i<num;i++)//2 is 1st prime num,until that num
        {
            // condition for non prime number
            if(num % i == 0)//number entered is divisible by nums less than itself
            {
                prime = false;
                break;
            }
        }
        if (prime)//true
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
