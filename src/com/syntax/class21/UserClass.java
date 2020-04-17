package com.syntax.class21;

public class UserClass {
	String name;
	int mobileNumber;
	UserClass(String name,int mobileNumber){
		this.name=name;this.mobileNumber =mobileNumber;
	}

}
class UserInfo extends UserClass{
	String userAddress;
	UserInfo(String userAddress,String name,int mobileNumber ){
		super(name,mobileNumber);
		this.userAddress=userAddress;
	}
	void userDetails() {
		System.out.println("Username is "+name +" who lives at "+userAddress+" and phone number is "+mobileNumber );
		
	}
}
