package vishal;

import java.util.Scanner;

public class ConversionLower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character  ");
	  ch=sc.next().charAt(0);
	 //1--->
	  
//	 if(ch>=48 && ch<=57)
//			System.out.println("Digite");
//	  
//	 else if(ch>='a' && ch<='z')
//	System.out.println("lower case");
//	
//	else if(ch>='A' && ch<='Z')
//	System.out.println("uppercase");
//	
//	else
//		System.out.println("Special character");
	 
	  
	  
	 //conversion captial to samll and small to captial
	 if(ch==Character.toUpperCase(ch))
	  ch = Character.toLowerCase(ch);
	 else
      ch = Character.toUpperCase(ch);

	 System.out.println("char is "+ch);
			
	  
	  
	
	//2---> by using ascii values;
	 
//	if(ch>=97 && ch<=122)
//		System.out.println("lower case");
//		else if(ch>=65 && ch<=90)
//		System.out.println("uppercase");

   if(sc!=null)
	sc.close();

	}

}
