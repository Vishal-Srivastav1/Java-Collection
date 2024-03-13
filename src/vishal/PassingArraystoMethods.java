package vishal;
                                                                             //  Returning Arrays from Methods
public class PassingArraystoMethods{                                         //  As usual, a method can also return an array. For example, the below program returns 
	 // Q-> printing the sum of arrays                                                                              //an array from method m1
	
	// Java program to demonstrate                                     //     // Java program to demonstrate
	// passing of array to method                                      //     // return of array from method
	 public static void sum(int[] arr)                                 //      
	    {                                                              //     class Test {
	        // getting sum of array values                             //         // Driver method
	        int sum = 0;                                               //         public static void main(String args[])
	                                                                   //         {
	        for (int i = 0; i < arr.length; i++)                       //             int arr[] = m1();
	           // sum += arr[i];                                       //      
	            sum=sum+arr[i];                                        //             for (int i = 0; i < arr.length; i++)
	        System.out.println("sum of array values : " + sum);        //                 System.out.print(arr[i] + " ");
	    }                                                              //         }
                                                                       //      
	    // Driver method                                               //         public static int[] m1()            Output
	    public static void main(String args[])                         //         {                                   1 2 3 
	    {                                                              //             // returning  array
	        int arr[] = { 3, 1, 2, 5, 4 ,8 };                             //             return new int[] { 1, 2, 3 };
	                                          //o/p                         //         }
	        // passing array to method m1    sum of array values : 23                            //     }
	        sum(arr);
	    }
	 
	   
	}
