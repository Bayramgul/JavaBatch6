package com.syntax.class22;

public class CreditCard {
	/*
	 * Create a class CreditCard and define variable balance and interest. Create an
	 * instance method that will calculate interest based on the given balance.
	 * Create 2 subclasses: Visa and AX. In AX class override method calculate
	 * interest. Call the method by creating an object of each of the three classes.
	 */
	
	double balance, interest;
	CreditCard(double balance){
		this.balance=balance;
	}
	protected void calculateInterest() {
		if(balance>500) {
			interest+=balance*0.2;
		}else {
			interest=0;
		}System.out.println(interest);
	}
}
class Visa extends CreditCard{
	Visa(double balance){
		super(balance);
	}
	
	
}
class AX extends CreditCard{
	AX(double balance){// call variable of parent class
		super(balance);
	}
	protected void calculateInterest() {
		
		if(balance>500) {// overriding method to find its own interest rate
			interest+=balance*0.1;// we are creating new interest now and assigning value
		}else {
			interest=0;
		}System.out.println(interest);
	}
	
}