package com.syntax.repl;

public class Repl145 {
	static void sum2D(int [][] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
         sum+=arr[i][j];
      }
     
    }
    System.out.println(sum);
  }
	public static void main(String[] args) {
		
		int [][] a = { 
                { 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 } 
 };
  Repl145 obj=new Repl145();
  		obj.sum2D(a);
		
	}

}
