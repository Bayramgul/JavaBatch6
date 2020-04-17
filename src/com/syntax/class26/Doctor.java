package com.syntax.class26;

public class Doctor {
	private long licenceID;
	private long phoneNumber;
	private String email;
	
	public long setGet(long licenceID) {//this is also possible
		return this.licenceID=licenceID;
	}
	public void setEmail(String email) {
		if(!email.contains("gmail")) {
			this.email=email;
		}else {
			System.out.println("Email must be of gmail type");
		} {
			System.out.println("Email connot be empty");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setPhone(long phoneNumber) {
		this.phoneNumber=phoneNumber;
		
	}
	public long getPhone() {
		return phoneNumber;
	}
}
