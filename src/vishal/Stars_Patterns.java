package vishal;

import java.util.Iterator;

public class Stars_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k=10;
         
         for (int row= 1; row<=k; row++) 
         {
        	 for (int col= 1; col<=k; col++) {
        		 
        		 if(row==1 || col==1 ||col==k || row==k  ||col==row ||row+col==k+1)
        		 System.out.print("*");
        		 else                              //**********
				System.out.print(" ");             //**      **
				                                   //* *    * *
			}                                      //*  *  *  *
			System.out.println();                  //*   **   *
		}                                          //*   **   *
	}                                              //*  *  *  *
                                                   //* *    * *
}                                                  //**      **
                                                   //**********