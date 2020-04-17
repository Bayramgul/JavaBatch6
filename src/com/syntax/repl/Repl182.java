package com.syntax.repl;

import java.util.Scanner;
import java.util.ArrayList;

public class Repl182 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());

		for (Integer num : nums) {
			System.out.print(num+ " ");

		}
	}

}
