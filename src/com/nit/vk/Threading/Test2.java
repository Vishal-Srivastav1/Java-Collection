package com.nit.vk.Threading;

public class Test2 extends Thread {
      @Override 
      public void run() {
    	  System.out.println("run Start");
    	  System.out.println("IN RUn #3:  "+this.getState());
    	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  System.out.println("IN RUn #5:  "+this.getState());
    	  System.out.println("run end "); 
    	  
      }
	
      
}
