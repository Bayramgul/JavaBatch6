package Repl;

import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
		int []array=new int[5];
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Input:");
		  for(int i=0;i<array.length;i++){
		    array[i]=scan.nextInt();
		  }System.out.println("Output:");
		  for(int j=0;j<array.length; j++){
		    System.out.println(array[j]*10);
	}
		  
		  Scanner input=new Scanner(System.in);
		    int [] num=new int[5];
		    for(int i=0;i<num.length;i++){
		     num[i]=input.nextInt();
		    }
		    for(int j=num.length-1;j>=0;j--){
		     System.out.println(num[j]) ;
		    }
		    

}}
