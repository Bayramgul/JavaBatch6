package com.syntax.class07;

import java.util.Scanner;

public class LoopsScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//we want to ask user's name and print Good Afternoon _____;
		System.out.println("What is your name?");
		String name=scan.nextLine();
		System.out.println("Good afternoon "+ name);
		int num=1;
		while (num<=5) {
			System.out.println("What is your name?");
			name=scan.nextLine();
			num++;
			System.out.println("Good Afternoon" + name);
		}
	}

}
