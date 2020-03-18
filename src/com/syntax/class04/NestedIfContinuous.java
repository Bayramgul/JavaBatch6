package com.syntax.class04;

public class NestedIfContinuous {
	
	//check if patient has any allergies
	//if no allergies you are healthy
	//otherwise, check if patient has :
	//orange allergy-->dont't eat orange
	//apple allergy-->don't eat apple
	//kiwi Allergy-->don't eat kiwi

	public static void main(String[] args) {
   boolean allergy=true;
   boolean appleAllergy=false;
   boolean orangeAllergy=true;
   boolean kiwiAllergy=false;
   if (allergy) {
	  System.out.println("Please answer below."); 
	  if (appleAllergy)
	   System.out.println("Do not eat apple.");
	  if(orangeAllergy) {
		  System.out.println("Do not eat oranges");
	  }if (kiwiAllergy) {
		  System.out.println("Do not eat kiwis");
	  }
	   
	   
   }else {
	   System.out.println("You are healthy");
   }
	}

}
