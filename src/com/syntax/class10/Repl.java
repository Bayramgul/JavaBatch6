package com.syntax.class10;

public class Repl {

	public static void main(String[] args) {
     int[] array = {45, 78, 12,  67, 55, 89, 23, 77, 88};
     
     for(int i=1; i<=2;i++) {
    	 if(i==1) {
    		 System.out.print(array [1]+" ");
    	 }else if(i==2) {
    		 System.out.print(array[2]+1+ " " );
    		 System.out.print(array[2]-1);
    	 }
     }
	}

}
