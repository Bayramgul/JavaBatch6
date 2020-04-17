package com.syntax.class26;

public class Quiz {

	 int m_x, m_y;

     public Quiz() {

            System.out.println("I am constructor");

      }


    public Quiz(int x, int y) {
    	 this();
             m_x = x;

             m_y = y;

    }
     void a() {
    	
    	System.out.println();
    }
      public static void main(String args[])  {
        Quiz p = new Quiz(3,6);
      }

}
