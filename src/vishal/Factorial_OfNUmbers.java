package vishal;

public class Factorial_OfNUmbers {                              //   Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n. 
	// 1. Iterative Solution for Factorial in Java                                         //     In this article, we will learn how to write a program for the factorial of a number in Java.
	 // Method to find factorial                                //
    // of given number                                          //   Formulae for Factorial
//    static int factorial(int n)                                 //   n! = n * (n-1) * (n-2) * (n-3) * ........ * 1
//    {                                                           //   Factorial of a Number in Java
//        int res = 1, i;                                         //   Example of Factorial in Java
//        for (i = 2; i <= n; i++)                                //   6! == 6*5*4*3*2*1 = 720. 
//            res *= i;                                           //   5! == 5*4*3*2*1 = 120
//        return res;                                             //   4! == 4*3*2*1 = 24
//    }
//  
//    // main method
//    public static void main(String[] args)
//    {
//        int num = 5;
//        System.out.println("Factorial of " + num + " is "
//                           + factorial(5));
//        
        
	//  2. Factorial in Java Using Recursive Method
        
//	  static int factorial(int n)
//	    {
//	        if (n == 0)
//	            return 1;
//	  
//	        return n * factorial(n - 1);
//	    }
//	  
//	    // main method
//	    public static void main(String[] args)
//	    {
//	        int num = 5;
//	        System.out.println("Factorial of " + num + " is "
//	                           + factorial(5));
//	    
        
	      //  3. One-line Solution (Using the Ternary operator)
        
         
	         static int factorial(int n) {
	         // May be static and non static
	            // single line to find factorial
	            return (n == 1 || n == 0) ? 1
	                                      : n * factorial(n - 1);
	        }
	      
	        // main function
	        public static void main(String args[])
	        {
	        	//Factorial_OfNUmbers obj =new Factorial_OfNUmbers();
	            int num = 5;
	          //  System.out.println("Factorial of " + num + " is "
	                              // + obj.factorial(num));
	            System.out.println("Factorial of " + num + " is "
                         + factorial(5));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
