package vishal;
   //How to do Explicit Conversion? 
public class Type_Conversion {

	 // Main driver method
    public static void main(String[] args)
    {
 
        // Double datatype
        double d = 100.04;
 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
        long l = (long)d;
 
        // Explicit type casting
           //down casting
        int i = (int)l;
 
        // Print statements
        System.out.println("Double value " + d);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i);
        System.out.println();
        System.out.println();
        System.out.println();
     // Declaring byte variable
        byte b;
 
        // Declaring and initializing integer and double
        int im = 257;
        double dm = 323.142;
 
        // Display message
        System.out.println("Conversion of int to byte.");
 
        // i % 256
        b = (byte)i;
 
        // Print commands
        System.out.println("i = " + im + " b = " + b);
        System.out.println("\nConversion of double to byte.");
 
        // d % 256
        b = (byte)d;
 
        // Print commands
        System.out.println("d = " + dm + " b= " + b);
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        // Declaring and initializing primitive types
        byte bm = 42;
        char c = 'a';
        short s = 1024;
        int in = 50000;
        float f = 5.67f;
        double dn = .1234;
 
        // The Expression
        double result = (f * bm) + (in / c) - (dn * s);
 
        // Printing the result obtained after
        // all the promotions are done
        System.out.println("result = " + result);
        
        bm = (byte)(bm * 2);
        
        // Display value in byte
        System.out.println(bm);
    }
}
