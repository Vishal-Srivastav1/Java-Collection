package com.nit.vk.Threading;

public class Test12 extends Thread{
     @Override
     public void run() {
    	 System.out.println("run start ");
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("IE Raised ");
		}
    	 System.out.println("Run End ");
     }
}
