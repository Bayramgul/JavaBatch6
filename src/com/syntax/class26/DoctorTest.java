package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc =new Doctor();
		System.out.println(doc.setGet(12345));
		//doc.setEmail("");
		doc.setEmail("abc@gmail.com");
		System.out.println(doc.getEmail());
		doc.setPhone(123456);
	}

}
