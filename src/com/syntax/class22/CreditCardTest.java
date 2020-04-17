package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard  card=new CreditCard (1000);
		card.calculateInterest();
		
		Visa visa=new Visa(3000);
		visa.calculateInterest();
		
		AX ax=new AX(2000);
		ax.calculateInterest();
	}

}
