package com.syntax.class10;

public class Repl67 {

	public static void main(String[] args) {
	
	    int [] nums={1,2,3,4,5,6,7,8,9,10};
	    for(int row=0;row<5;row++){ 
	      for(int col=1;col<=10;col++ ){
	        if (row==0){
	         System.out.print(col+" ");}
	         else if(row==1){ 
	        System.out.print(col*2+" ");}
	        else if (row ==2 ){
	          System.out.print(col*3+" ");}
	          else if(row==3){
	            System.out.print(col*4+" ");
	            }else if(row==4){
	               System.out.print(col*5+" ");
	            }}
	             System.out.println(); 
	}

}}
