package com.syntax.repl;

public class Repl175 {

	public static void main(String[] args) {
		Account obj=new Account();
		  obj.setAccount("7560504000");
		  obj.setName("Sumair");
		  obj.setEmail("sumair@syntax.com ");
		  obj.setAmount(50000.0);
		  System.out.println(obj.getAcc_no()+" "+ obj.getName()+" "+obj.getEmail()+" "+
		  obj.getAmount());

	}

}
class Account {
	 
	private String acc_no;
	 private  String name;
	 private  String email;
	 private  double amount;
	 
	 public String getAcc_no(){
	   return acc_no;
	 } 
	 public String getName(){
	   return name;
	 }
	 public String getEmail(){
	   return email;
	 }
	 public double getAmount(){
	   return amount;
	 }
	 public void setName(String name){
	   this.name=name;
	 }
	 public void setAccount(String acc_no){
	   this.acc_no=acc_no;
	 }
	 public void setEmail(String email){
	   this.email=email;
	 }
	 public void setAmount(double amount){
	   this.amount=amount;
	 }
	}