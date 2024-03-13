package com.nit.vk.Threading;
		//Develop class With user defined method can be Static or non-Static Method
		//Display the thread name in which this method is executing 
		//Run this method from two different thread..
public class User4 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Test4_1 t1 = new Test4_1();
		Test4_1 t2 =new Test4_1();
		                                                
		t1.start();                                      // Executed in the thread Thread-0  
        t2.start();                                      // Executed in the thread Thread-1 
        Test4.m1();                                      // Executed in the thread main      
                                                                                             
	}                                                        
                                                           
}                                                          
                                                             
                                                             