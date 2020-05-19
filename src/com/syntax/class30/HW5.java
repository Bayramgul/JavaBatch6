package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class HW5 {

	public static void main(String[] args) {
		/*
		 * Create a collection of integers in which you can keep duplicates.
		 * Write a logic to find sum of all integers
		 */
		List <Integer> nums=new ArrayList<>();
		nums.add(12);
		nums.add(22);
		nums.add(33);
		nums.add(44);
		nums.add(33);
		nums.add(22);
		nums.add(12);
		
		int sum=0;
		for(int n:nums) {
			sum+=n;
		}
		System.out.println(sum);
	}

}
