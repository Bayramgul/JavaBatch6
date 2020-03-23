package com.syntax.repl;

public class Repl105 {
	int number;

	void print() {
		for (int number = 1; number <= 10; number++) {

			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		Repl105 obj = new Repl105();
		obj.number = 1;
		obj.print();

	}

}
