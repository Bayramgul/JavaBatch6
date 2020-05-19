package com.syntax.class33;

public class MultipleExceptionHandling {
public static void main(String[] args) {
	int [] arr= {1,2};

	String str="hello";
	try {
System.out.println(arr[10]);//multiple catch is not possible with one try and multiple catches, only one exception will be handled
char character=str.charAt(10);//others will be skipped, won't be handled but code will continue without terminating
System.out.println(character);//it is better to write specific separate try catches or one try and generic Exception in catch to handle multiple exceptions
	}
	catch(StringIndexOutOfBoundsException se)  {
		System.out.println(se);
	}catch(IndexOutOfBoundsException eou) {
		System.out.println(eou);
	}
	
	System.out.println("The code continues");
}

}
