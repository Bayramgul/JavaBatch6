package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardDemo {

	public static void main(String[] args) {
		
		List <Card> cards=new LinkedList<>();
		cards.add(new BAO("BAO"));
		cards.add(new Chase("Chase"));
		cards.add(new TDBank("Td Bank"));
		Iterator <Card> card=cards.iterator();
		System.out.println("***Iterator***");
		while(card.hasNext()) {
			Card c=card.next();
			c.deposit();
			c.pay();
		}
		System.out.println("*** For Loop***");
		for(int i=0;i<cards.size();i++) {
			cards.get(i).deposit();
			cards.get(i).pay();
		}
		System.out.println("*** Advanced For Loop***");
		for(Card c:cards) {
			c.deposit();
			c.pay();
		}
	}

}
