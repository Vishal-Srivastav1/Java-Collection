package vishal;
import java.util.Scanner;

public class Scanner1 {
  public static void main(String[]args) {
	 while(true) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Chose one option");
	  System.out.println("1.Arithmetic Opreaction");
	  System.out.println("2.Max and Min");
	  System.out.println("3.Even or odd");
	  System.out.println("4.Palindron");
	  System.out.println("5.Exit");
	  
	  
	  System.out.println("Enter Option");
	  int option = scn.nextInt();scn.nextLine();
	  if (option == 5) {
          System.exit(option);
        }
	  switch(option) {
	  case 1:{
		  System.out.println("Chose one option");
		  System.out.println("1. Addition");
		  System.out.println("2. Substraction");
		  System.out.println("3. Multiplicaton");
		  System.out.println("4. Division");
		  System.out.println("5. Reminder");
		  option = scn.nextInt();scn.nextLine();
		  
		  ////
		
		  switch(option) {
		  case 1:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    int c= AO.add(a,b);
			    System.out.printf("The addition of %d and %d is =  %d  ",a,b,c);
			    System.out.println("");
			    break;
			    
		  }
		  
		  case 2:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    int c= AO.sub(a,b);
			    System.out.printf("The Substraction of %d and %d is =  %d   ",a,b,c);
			    System.out.println("");
			    break;
		  }
		  
		  case 3:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    int c= AO.mul(a,b);
			    System.out.printf("The Multiplication of %d and %d is =  %d   ",a,b,c);
			    System.out.println("");
			    break;
		  }
		    
		  case 4:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    int c= AO.div(a,b);
			    System.out.printf("The Division of %d and %d is =  %d   ",a,b,c);
			    System.out.println("");
			    break;
		  }
		   
		  case 5:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    int c= AO.rem(a,b);
			    System.out.printf("The Reminder of %d and %d is =  %d   ",a,b,c);
			    System.out.println("");
			    break;
		  }
		  
		 }//Ao inner switch close
		  System.out.println("");
		 break; 
	  }//outer switch case 1 close
	  
	  case 2:{//max and min
		  System.out.println("Chose one option");
		  System.out.println("1. max or min");
		  option = scn.nextInt();scn.nextLine();
		  
	 switch(option) {  
	  case 1:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    AO.maxmin(a,b);
			  break;
		  }
	    }
	    System.out.println("");
	   break;
	  }
	 
	  case 3:{//Even or odd
		  System.out.println("Chose one option");
		  System.out.println("1. Even or odd");
		  option = scn.nextInt();scn.nextLine();
	 switch(option) {  
	  case 1:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			    
			    AO.evenodd(a,b);
			  break;
		  }
	   }
	 System.out.println("");
	 break;
	  }
	
	  
	  case 4:{//Palindron
		  System.out.println("Chose one option");
		  System.out.println("1. max");
		  System.out.println("2. min");
		  
	 switch(option) {  
	  case 1:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			  break;
		  }
		  
		  case 2:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			  break;
		  }
	    }
	 break;
	
	  }
	
	 
	  case 5:{//exit
		  System.out.println("Chose one option");
		  System.out.println("1. max");
		  System.out.println("2. min");
		  
	 switch(option) {  
	  case 1:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			  break;
		  }
		  
		  case 2:{
			    System.out.println("Enter First num.");
			    int a=scn.nextInt();
			    
			    System.out.println("Enter Second num.");
			    int b=scn.nextInt();
			  break;
		  }
	    }
	 break;
	  }
	
	  
	  default:{
		  System.out.println("Sorry chose one...........!");
		  
	  }//outer switch close 
	  if(scn!=null) 
		  scn.close();
 }
}//WHILE CLOSE
}//MAIN CLOSE
}//CLASS CLOSE
