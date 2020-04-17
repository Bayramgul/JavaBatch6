package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW4 {

	public static void main(String[] args) {
		// Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
		// number that is divisible by 5 from that arrayList.
		ArrayList <Integer> nums=new ArrayList<>();
		for(int i=1; i<=50;i++) {
			if(i%2==0) {
				nums.add(i);
				
			}
		}
		
		System.out.println("Arraylist contain even numbers between 1-50: "+nums);
		
		Iterator <Integer> num=nums.iterator();
		while(num.hasNext()) {
			if(num.next()%5==0) {
				num.remove();
			}
		}System.out.println(nums);
		for(int n:nums) {
			
	System.out.print(n+" ");	}
	}

}
