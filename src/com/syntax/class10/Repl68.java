package com.syntax.class10;

public class Repl68 {

	public static void main(String[] args) {
//int col=0;
//		for(int row=0;row<4;row++){
//			
//		      for( col=0;col<4;col++){
//		       if (row==0){
//		           System.out.print("$");}
//		           else if (row ==1){
//		              if(col ==1 || col ==2){
//		                System.out.print("$ ");}else {
//		                	System.out.println(" $");
//		                }
//		              }
//		           }if(row==2){
//		             if(col ==1 || col ==2){
//		                System.out.print("$ ");
//		              }else {
//		            	  System.out.println(" $");
//		              }
//		           }else if(row==3){
//		             System.out.print("$");
//		           }
//		      } 
//		System.out.println();
		
		for(int row=0;row<4;row++){
		      for(int col=0;col<4;col++){
		        switch(row){
		          case 0:System.out.print("$");break;
		          case 1: if(row==1 && col==3) {
		        	  System.out.println("$");
		          }else 
		          break;
		          case 2: System.out.print("$ ");
		          break;
		          case 3:System.out.print("$");break;
		        }
		      }System.out.println();
		    }
		    }
	}


