package vishal;
// chaking the given value are same or not in any pattern;
//like vishal == ishval; etc...

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString_equalto_stringEachcharacter {

	      static String a;
	      static String b;
	      
		
		// TODO Auto-generated method stub
		public static void isAnagram(String a,String b)
		{
			char[] ac=a.toCharArray();
			char[] bc=b.toCharArray();
			Arrays.sort(ac);
			Arrays.sort(bc);
			
			if( String.valueOf(ac).equals(String.valueOf(bc))== true)  
			System.out.println(" Given Value Are same");
			else 
				System.out.println("Given value are wrong");
				
		
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a First Value ");
			a=scanner.nextLine();
			System.out.println("Enter a Second Value ");
		 	b=scanner.next();
		 	isAnagram(a, b);
		 	//System.out.println(ac);
		 	

	}

}
