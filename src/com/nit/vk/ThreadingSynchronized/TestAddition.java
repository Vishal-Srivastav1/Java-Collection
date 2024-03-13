package com.nit.vk.ThreadingSynchronized;

public class TestAddition {
    private int x;
     private int y;
     //
   //  Synchronized are executing Sequencely
    public synchronized void add(int x,int y) {             //first check Values without synchronized and after synchronized
	 this.x=x;                                     // without synchronized we will get wrong values
	  this.y=y;                                          //  Thread-0 res 150 
	 try { 	                                            //  Thread-1 res 150 
		Thread.sleep(100);                      // with synchronized we will get right values separate and secure values
    } catch (InterruptedException e) {               // Thread-0 res 110
		// TODO: handle exception                   // Thread-1 res 150
		e.printStackTrace();           
	}                                  
        int res=this.x+this.y;
     System.out.println(Thread.currentThread().getName()+" res "+res);
	}
}
