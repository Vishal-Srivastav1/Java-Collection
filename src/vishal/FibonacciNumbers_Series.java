package vishal;

public class FibonacciNumbers_Series {
	//Method 1 ( Use recursion ) 
	
	// Fibonacci Series using Recursion

//	    static int fib(int n){
//	        if (n==0)
//	            return 0;
//	      else if(n==1 || n==2)
//	            return 1;
//	        return fib(n - 1) + fib(n - 2);
//	    }
//	 
//	    public static void main(String args[])
//	    {
//	        int n = 9;
//	        System.out.println(fib(n));
//	        
//	        
	
	// Method 2 ( Use Dynamic Programming ) 
	        
//	 static int fib(int n)
//	    {
//	        /* Declare an array to store Fibonacci numbers. */
//	        int f[] = new int[n + 1];
//	        int i;
//	 
//	        /* 0th and 1st number of the series are 0 and 1*/
//	        f[0] = 0;
//	 
//	        if (n > 0) {
//	            f[1] = 1;
//	 
//	            for (i = 2; i <= n; i++) {
//	                /* Add the previous 2 numbers in the series
//	             and store it */
//	                f[i] = f[i - 1] + f[i - 2];
//	            }
//	        }
//	 
//	        return f[n];
//	    }
//	 
//	    public static void main(String args[])
//	    {
//	        int n = 9;
//	        System.out.println(fib(n));  
//	        
	
	//Method 3 ( Use Dynamic Programming with Space Optimization)
	
	static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
 
    public static void main(String args[])
    {
        int n = 6;
        System.out.println(fib(n));
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}
	
