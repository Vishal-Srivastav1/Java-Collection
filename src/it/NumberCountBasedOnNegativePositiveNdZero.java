package it;

import java.util.Scanner;


public class NumberCountBasedOnNegativePositiveNdZero
{
   public static void main(String[] args)
   {
      int countp=0, countN=0, countZ=0, i;
      int[] arr= new int[10];
      Scanner scanner= new Scanner(System.in);
       System.out.println("Enter 10  num");
       for ( i = 0; i<10; i++) 
		 arr[i]=scanner.nextInt();
	
      for (i = 0; i <10; i++) {
		if (arr[i]<0) 
			countN++;
		else if (arr[i]>0) 
			countp++;
		else 
			countZ++;
		
	}
       
      System.out.println();
      System.out.println("Total negative Num "+countN);
      System.out.println("Total positive Num "+countp);
      System.out.println("Total Zero Num "+countZ);
      System.out.println();
    
    
   }
}