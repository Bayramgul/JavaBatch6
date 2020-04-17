package com.syntax.class28;

abstract class Card {
	/*
	 * Create a Card class that will have implemented and unimplemented methods and
	 * a constructor that will initializes credit card type. Create 3 subclasses of
	 * a Card card. Create 3 objects of different card and store them into
	 * LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 */
	String cardType;

	Card(String cardType) {
		this.cardType = cardType;
	}

	void pay() {
		System.out.println("You can pay with " + cardType);
	}

	abstract void deposit();
}

class BAO extends Card {

	BAO(String cardType) {
		super(cardType);

	}
	@Override
	void deposit() {
		System.out.println("You can deposit money with " + cardType);
	}

}
class Chase extends Card {

	Chase(String cardType) {
		super(cardType);
	}

	@Override
	void deposit() {
		System.out.println("You can deposit money with " + cardType);
	}

}
class TDBank extends Card {

	TDBank(String cardType) {
		super(cardType);

	}
	@Override
	void deposit() {
		System.out.println("You can deposit money with " + cardType);
	}
}