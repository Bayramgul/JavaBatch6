package com.syntax.class10;

public class Test {

	public static void main(String[] args) {
		  /*
		    1 2 3 4 5 6 7 8 9 10 
			2 4 6 8 10 12 14 16 18 20 
			3 6 9 12 15 18 21 24 27 30 
			4 8 12 16 20 24 28 32 36 40 
			5 10 15 20 25 30 35 40 45 50
		   */
   //i want to print 5 rows and 10 columns number patters
		

		
			    int odd=0;
			    int [] nums={1,2,3,4,5,6,7,8,9,10};
			    for(int row=0;row<5;row++){ //this is for row num 10
			      for(int col=1;col<=10;col++ ){
			        if (row==0){
			         System.out.print(col+" ");}
			         else if(row==1){
			        System.out.print(col*2+" ");}
			        else if (row ==2 ){
			          System.out.print(col*3+" ");}
			          else if(row==3){
			            if(col%3==0){
			            col=col+=3;
			            System.out.print(col);
			            if (col==30){
			              continue;
			            }else if (row==3){if(col%2==0 && col==2 && col<=20){
			              col=col;
			              System.out.print(col*2);
			              
			            }
			              
			            }
			            
			          }
			        }
			    
			        }
			        
			      }
			     
			        
			        
			      
			      
			    
			  
			  
			
		
		
		
		}
		
		
	
}
