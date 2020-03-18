package com.syntax.class09;

public class PrimeNumbers1 {

	public static void main(String[] args) {
for(int i=1;i<100;i++) {
    
            
            boolean PrimeNum=true;
            
            
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    
                    PrimeNum=false;
                    break;
                }
            
            }
            
            if(PrimeNum) {
                System.out.println(i);
                
                }
        
        }



	}

}
