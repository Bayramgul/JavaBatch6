package com.syntax.repl;

public class Repl113 {

	public static void main(String[] args) {
		 Repl113 obj=new Repl113();
	     int sumx=obj.sumEvenToX(5);
	     int sumx1=obj.sumEvenToX(8);
	     System.out.println(sumx);
	     System.out.println(sumx1);
	  }
	  int sumEvenToX(int x){
	    int sum=0;
	    for(int i=1;i<=x;i++){
	      if(i%2==0){
	        sum+=i;
	       
	      }
	    }
	    return sum;
	}

}
