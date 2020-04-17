package com.syntax.class25;

public class BankTest {

	public static void main(String[] args) {
      BOA bank=new BOA();
      bank.depositMoney();
      bank.financing();
      bank.giveCredit();
      bank.trust();
      bank.withdraw();
      System.out.println("***** Below Upcasting BOA to Bank: will print implemented methods of Bank & Trsutable interfaces****");
      Bank b=new BOA();
      b.depositMoney();
      b.trust();
      b.withdraw();
      
      System.out.println("**** below: only Trustable method will be implemented overrridden by BOA***");
      Trustable t=new BOA();
      t.trust();
	}

}
