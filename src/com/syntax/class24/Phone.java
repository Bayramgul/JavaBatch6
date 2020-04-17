package com.syntax.class24;

abstract class Phone {
	// implemented method
	void call () {
		System.out.println("Phone can make a call");
	}
	void text() {
		System.out.println("Phone can send texts");
	}// unimplemented method, undefined methods=abstract methods
	abstract void takePicture();
	abstract void playMusic();
}
 class Iphone extends Phone{

	@Override
	void takePicture() {
		System.out.println("Iphone can take picture");
	}

	@Override
	void playMusic() {
		System.out.println("Iphone can play music");
	}
	void playGames(){
		System.out.println("on Iphone we can play games");
	}
	
}
 class Samsung extends Phone{

		@Override
		void takePicture() {
			System.out.println("Samsung can take picture");
		}

		@Override
		void playMusic() {
			System.out.println("Samsung can play music");
		}
		
		
	}