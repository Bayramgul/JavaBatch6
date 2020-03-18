package com.syntax.class10;

public class Exercise1Arrays {

	public static void main(String[] args) {
		// write a prg so that each element of the array is assigned twice the value of
		// its index.

		int j = 0;
		int[] nums = { 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < nums.length; i++) {
			for (j = 0; j < nums[i]; j++) {
				System.out.println(nums[j] + "=" + 2 * j);
			}
		}
	}

}
