package com.syntax.class19;

public class USA {

	String state,stateCapital;
	
	public USA(String state, String stateCapital ) {
		this.state=state; this.stateCapital=stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	public void displayInfo() {
		displayState();// by default compiler adds this keyword
		displayStateCapital();
	}
	public static void main(String[] args) {
		USA state1=new USA("Texas","Austin");
		
		state1.displayState();
		state1.displayStateCapital();
		state1=new USA("Georgia","Atlanta");//reassigned obj argument
		state1.displayInfo();// includes 2 other methods 
		
	}

}
