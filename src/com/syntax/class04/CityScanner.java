package com.syntax.class04;

import java.util.Scanner;

public class CityScanner {

	public static void main(String[] args) {
		Scanner hey=new Scanner(System.in);
		System.out.println("What is your city?");
		
		String city=hey.nextLine();
		
		System.out.println("What is the tmeperature in "+ city+" "
				+ "in fahrenheit");
		int temp=hey.nextInt();
		int celcius=(temp-30)/2;
		
		System.out.println("The tempearture in the city "+ city+" is "+ celcius+" Celcius");
		
		
	}

}
