package vishal;

public class Swapping_Varriable {
	 public static void main(String[] args)                //  Steps to Swap Two Numbers in Java
	    {                                                  //  Below are the simple steps we follow: 
	        int x = 100, y = 200;                          //
	                                                       //  Assign x to a temp variable: temp = x 
	        System.out.println("Before Swap");             //  Assign y to x: x = y 
	        System.out.println("x = " + x);                //  Assign temp to y: y = temp
	        System.out.println("y = " + y);
	  
	        //1>>  Swapping using three
	        // Variables/                                          //   OUTPUT
	        int temp = x;                                        //   Before Swap
	        x = y;                                               //   x = 100
	        y = temp;                                            //   y = 200
	                                                             //   After swap
	        System.out.println("After swap");                    //   x = 200
	        System.out.println("x = " + x);                      //   y = 100
	        System.out.println("y = " + y);
	        
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        
//	        //2>>  Using Two Variables
//	       // int a = 5;
//	      //  int b = 10;
//	  
//	        // print statement
//	        System.out.println("Before swapping, a = " + a
//	                           + " and b = " + b);
//	  
//	        a = a + b;                                  // Before swapping, a = 5 and b = 10
//	        b = a - b;                                  // After swapping, a = 10 and b = 5
//	        a = a - b;
//	  
//	        System.out.println("After swapping, a = " + a
//	                           + " and b = " + b);
//	        System.out.println();
	        System.out.println();
	        
	       //3>>  Using Two Variables (Single Statement)
	        
	            Integer a = 10;
	            Integer b = 20;
	            System.out.println("Before swapping, a = " + a
	                               + " and b = " + b);
	      
	            // Swapping a and b using
	            // below statement
	            b = a + b - (a = b);
	      
	            System.out.println("Before swapping, a = " + a
	                               + " and b = " + b);
	        }
	        
	       
	    }


