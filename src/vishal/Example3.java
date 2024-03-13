package vishal;

public class Example3 {
   static Example3 example3=new Example3();
   static {                                                              ///   
	   System.out.println("SB");                                         ///   NSB
   }                                                                     ///   EXP# CONSTRUCTOR
   {                                                                     ///   SB
	   System.out.println("NSB");                                        ///   NSB
   }                                                                     ///   EXP# CONSTRUCTOR
                                                                         ///   Main
   public Example3() {                                                   ///   
                                                                         ///   
	   System.out.println("EXP# CONSTRUCTOR");                           ///   before a 10
}                                                                        ///   example3.x 20
   public static void main(String[] args) {                              ///   After modification example3.x 30
	   Example3 example4 =new Example3();                                ///   after a 20
	                                                                     ///   example3.a 20
	System.out.println("Main");                                          ///   example4.x 20
	System.out.println();System.out.println();                           ///   example4.a 20
	//Example3 e2=new Example3();	                                     ///   
	System.out.println("before a "+a);                                   ///   
	System.out.println("example3.x "+example3.x);                        ///   
	example3.x=30;
	System.out.println("After modification example3.x "+example3.x);
	a=20;
	System.out.println("after a "+a);
	System.out.println("example3.a "+example3.a);
	System.out.println("example4.x "+example4.x);
	System.out.println("example4.a "+example4.a);
}                       
   static int a=10;     
   int x=20;            
                        
}                       
                        
                        
                        
                        
                       
                       
                       
                       
                       
                       
                       
                        