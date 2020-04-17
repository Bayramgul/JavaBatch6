package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	 * Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	 * has petType attribute. Create 3 objects of the sub classes and store them in
	 * ArrayList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 */

	public static void main(String[] args) {
	
		ArrayList <Insurance> list=new ArrayList<>();
		list.add(new Car("Geico", "Infiniti"));
		list.add(new Pet("PetsBest","Cat"));
		list.add(new Health("Aetna"));
		Iterator<Insurance> alist=list.iterator();
		System.out.println("*******Iterator********");
		while(alist.hasNext()) {
		Insurance l=alist.next();
		l.getQuote();
		l.cancelInsurance();
		System.out.println("--------");
		}
		System.out.println("********Enhanced for Loop****");
		for(Insurance l:list) {
			l.getQuote();
			l.cancelInsurance();
			System.out.println("------");
		}
		System.out.println("*******For loop*******");
		for(int i=0;i<list.size();i++) {
			list.get(i).getQuote();
			list.get(i).cancelInsurance();
			System.out.println("------");
		}
	}

}
abstract class Insurance{
	
	String insuranceName;
	Insurance (String insuranceName){
		this.insuranceName=insuranceName;
	}
	abstract void getQuote();
	abstract void cancelInsurance();
}
class Car extends Insurance{
	String carModel;
	Car(String insuranceName,String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	void getQuote() {
		System.out.println(carModel+ " gets "+ insuranceName+ " insurance quote");		
	}

	@Override
	void cancelInsurance() {
		System.out.println(carModel+ " cancels "+ insuranceName+ " insurance quote");	
	}
}
class Pet extends Insurance{
	String petType;
	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}
	@Override
	void getQuote() {
		System.out.println(petType+ " gets "+ insuranceName+ " insurance quote");	
	}

	@Override
	void cancelInsurance() {
		System.out.println(petType+ " cancels "+ insuranceName+ " insurance quote");	
	}
	
}
class Health extends Insurance{

	Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	void getQuote() {
		System.out.println(insuranceName+ " cancel insurance quote in health class");	

	}
	@Override
	void cancelInsurance() {
		System.out.println(insuranceName+ " cancels  insurance quote in health class");			
	}
}
