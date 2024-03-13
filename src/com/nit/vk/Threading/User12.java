package com.nit.vk.Threading;

public class User12 {
   public static void main(String[] args) throws InterruptedException {
	 System.out.println("Main start ");
	 Test12 t1 = new Test12();
	 t1.interrupt();// when we call Interrupt() method its bringing to the ready to run State.
	                 // it brings the thread out from paused State.
	 t1.start();
	 t1.interrupt();    // it brings the thread out from paused State.
//	                                                                      
	 Thread.sleep(3000);                                                  
	 t1.interrupt();                                                      
	 System.out.println("Main End ");                                        // Main start   
//	                                                                         // run start    
}                                                                            // IE Raised    
}                                                                            // Run End      
                                                                             // Main End     
                                                                                           