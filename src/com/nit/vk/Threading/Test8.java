package com.nit.vk.Threading;

public class Test8 extends Thread{
     public Test8(String name) {
    	 super(name);
     }
     @Override
     public void run() {
    	 System.out.print(getName()+" is started as "+(isDaemon() ? " daemon " :" non-demon\n"));
    	 
    	 try { Thread.sleep(3000);
			
		} catch (InterruptedException e) {	}
    	
    	 for(int i=1; i<=20; i++) {
    		  System.out.println(" run "+i);
    	 }
		
    	 
    	 
    	 
     }
     
}
