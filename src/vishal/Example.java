package vishal;

public class Example {
	
     int x=m1();
   //static int x=10;
   
   int m1() {
	   System.out.println("Ex Nsv");
	   return 10;
   }
   
 // static 
  {
	   System.out.println("Ex NsB");
	   System.out.println("x= "+x);
	  // System.out.println("y= "+y);
	//  System.out.println("y= "+y);  error rt
	 //  System.out.println("y= "+getY());  error rt
	   System.out.println("Ex NsB End");
   }
  
//  {
//	  System.out.println("Ex NsB");  
//  }
   
   public Example() {
	 System.out.println("Ex NpC");
}
   
   void m2() {
	   System.out.println("Ex Nsm");
   }
	
}
///Ex Nsv
//Ex NsB
//Ex NpC
//Sa Nsv
//Sa NsB
//Sa NpC
//20
//10
///