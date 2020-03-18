package com.syntax.class02;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//widening, happens implicitly;
		double d=10;
				System.out.println(d);
		double x=4.5;
		int y= (int)x;
		System.out.println(y);
		
		double a=19.99;
		int b=(int)a;
		
		System.out.println(b);
		//byte -128 -->127
		byte e=(byte)1286;
		System.out.println(e);
	}

}
