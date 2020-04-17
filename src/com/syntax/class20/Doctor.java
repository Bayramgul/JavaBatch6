package com.syntax.class20;

public class Doctor {
	int doctorId;
	String name;
	void doctor() {
		System.out.println(" Doctors work at hospital");
	}
	
	public Doctor(String name, int doctorId ) {
		this.name=name;// to initialize variable
		this.doctorId=doctorId;
	}
}
class Dentist extends Doctor{
	
	@Override
	void doctor() {
		// TODO Auto-generated method stub
		super.doctor();
	}

	Dentist(String name, int doctorId){
		super (name, doctorId);//
	}
}