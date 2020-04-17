package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {
		Phone iphone=new Iphone();//upcasting is must when we create obj of subclass of abstract class
	iphone.call();
	iphone.playMusic();
	iphone.takePicture();
	iphone.text();
	
	System.out.println("------");
	Phone samsung=new Samsung();
	samsung.call();
	samsung.playMusic();
	samsung.text();
	samsung.takePicture();
	
	}

}
