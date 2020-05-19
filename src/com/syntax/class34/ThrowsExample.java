package com.syntax.class34;

public class ThrowsExample {

	public static void main(String[] args) {
		multipleSleep();
	}
	public static void multipleSleep()  {
		try{
			sleep();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
public static void sleep() throws InterruptedException {
	Thread.sleep(2000);
}
}
