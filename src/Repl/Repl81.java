package Repl;

public class Repl81 {

	public static void main(String[] args) {
//
//		int[][] a = {
//			{5,2,3,7},
//			{1,5,1,1},
//			{8,3,1,2}
//		};
//		int largest=a[0][0];
//		for(int row=0;row<a.length;row++){
//		  for(int colm=0;colm<a[row].length;colm++){
//		    if(a[row][colm]>largest){
//		      largest=a[row][colm];
//		    }else {
//		      largest=largest;
//		    }
//		   
//		  }
//		} System.out.println(largest);
		//repl 82

		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
		};
		int sum=0;
		for(int i=0; i<a.length;i++){
		  for(int j=0;j<a[i].length;j++){
		    System.out.println(a[i][j]);
		    sum+=a[i][j];
		  } 
		}
	
		System.out.println(sum);

	}

}
