package com.syntax.class21;

public class HW5 {
	int length,width,height;

	public static void main(String[] args) {
		/*
		 * Create 1 class in which create a methods that will calculate the area
		 * (volume) of Rectangle Square Box
		 * Use separate class to test your code
		 */
		
	}
	
	public void Area(int length, int width,int height) {
		System.out.println(" The volume of square is: "+(length*width*height));
		System.out.println(" The area of square is: "+(2*(length*width+height*length+width*height)));
	}
	public void Area(String rect,int length, int width,int height) {
		
	System.out.println(" The volume of " + rect+" is: "+(length*width*height));
	System.out.println(" The area of "+ rect+" is: "+(2*(length*width+height*length+width*height)));
	}
}
