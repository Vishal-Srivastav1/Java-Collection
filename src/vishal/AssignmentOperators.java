package vishal;

public class AssignmentOperators {

	 public static void main(String[] args)
	    {
	         
	        // Assignment operators                                                               In many cases, the assignment operator can be combined with other operators to build a shorter version of the statement 
		                                                        //10-2=8                                  //called a Compound Statement. For example, instead of a = a+5, we can write a += 5. 
	         int f = 7;
	        System.out.println("f += 3: " + (f += 3));             //   f += 3:       10                +=, for adding the left operand with the right operand and then assigning it to the variable on the left.
	        System.out.println("f -= 2: " + (f -= 2));             //   f -= 2:       8                 -=, for subtracting the right operand from the left operand and then assigning it to the variable on the left.
	        System.out.println("f *= 4: " + (f *= 4));             //   f *= 4:       32                *=, for multiplying the left operand with the right operand and then assigning it to the variable on the left.
	        System.out.println("f /= 3: " + (f /= 3));             //   f /= 3:       10                /=, for dividing the left operand by the right operand and then assigning it to the variable on the left.
	        System.out.println("f %= 2: " + (f %= 2));             //   f %= 2:       0                 %=, for assigning the modulo of the left operand by the right operand and then assigning it to the variable on the left.
	        System.out.println("f &= 0b1010: " + (f &= 0b1010));   //   f &= 0b1010:  0
	        System.out.println("f |= 0b1100: " + (f |= 0b1100));   //   f |= 0b1100:  12                               * : Multiplication
	        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));   //   f ^= 0b1010:  6                                / : Division
	        System.out.println("f <<= 2: " + (f <<= 2));           //   f <<= 2:      24      6*2=12  12*2=24          % : Modulo
	        System.out.println("f >>= 1: " + (f >>= 1));           //   f >>= 1:      12       24/2=12                 + : Addition
	        System.out.println("f >>>= 1: " + (f >>>= 1));         //   f >>>= 1:      6                               – : Subtraction
	        System.out.println();
	        System.out.println();
	        System.out.println("Shift Opraters");                                             // <<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two.
	        System.out.println();                                                            //>>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number.
	                                                                                         //                 Similar effect to dividing the number with some power of two.
	        //Shift Opraters                                                                 >>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.
	        int a = 10;
	        
	          // using left shift
	       
	        System.out.println("a<<1 : " + (a << 1));  //Shift Opraters
	        // using right shift                       //a<<1 : 20
	        System.out.println("a>>1 : " + (a >> 1));  //a>>1 : 5
	    }

}
