package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		int rate=3;
		int price=100000;
		if (rate>4.5) {
			System.out.println("I will not buy this house.");
		}else {
			System.out.println("I will consider buying.");
			if (price >200000) {
				System.out.println("I will take a loan!");
			}else {
				System.out.println("I will pay cash");
			}
		}
	}

}
