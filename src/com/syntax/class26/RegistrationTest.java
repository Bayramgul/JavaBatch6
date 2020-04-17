package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration r= new Registration();
		r.setEmail("john@yahoo.com");
		r.setName("Johnnyy12345");
		r.setPassword("Abdjkhgbhbh");
		
		System.out.println(r.getEmail());
		System.out.println(r.getName());
		System.out.println(r.getPassword());
	}

}
