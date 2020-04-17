package com.syntax.repl;

public class Repl135 {
	public static  int maxValue (int [] arr){
	  
	  int max= arr[0];
	  for(int i=1; i<arr.length;i++ ) {
		  if(arr[i]>max) {
			  max=arr[i];
		  }
	  }return max;
	}

	public static void main(String[] args) {
		{
			int[] arr = {5,12,-3,7,3,22};
			System.out.println(maxValue(arr)); //should print 22
			
			
//				  R136SyntaxTechnologies obj=new R136SyntaxTechnologies();
//				  R136SyntaxTechnologies obj1=new R136SyntaxTechnologies("Syntax",6,2020," 07/30/2020");
//				  obj1.display();
			
		}
		
	}

}
