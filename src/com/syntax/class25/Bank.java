package com.syntax.class25;

interface CreditUnion {
	void giveCredit();
}

interface Trustable {
	void trust();
}

public interface Bank extends Trustable {// interface extends another interface
	void depositMoney();//we use extends keyword for interface+interface

	void withdraw();
}

class PNC extends Finance implements Bank {

	@Override
	public void depositMoney() {
		System.out.println("You can deposit money in PNC");
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw money in PNC");
	}

	@Override
	public void trust() {
		System.out.println("PNC is trustbale");
	}

}

class BOA extends Finance implements Bank, CreditUnion {

	@Override
	public void depositMoney() {
		System.out.println("You can deposit money in BOA");
	}

	@Override
	public void withdraw() {
		System.out.println("You can withraw your  money in BOA");
	}

	@Override
	public void trust() {
		System.out.println("BAO is trustbale");
	}

	public void giveCredit() {
		System.out.println(" BAO gives credit");
	}

}

class Finance {
	public void financing() {
		System.out.println(" You can use zelle for money tranfer");
	}
}
