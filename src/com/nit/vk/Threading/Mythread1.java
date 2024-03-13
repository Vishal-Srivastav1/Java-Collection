package com.nit.vk.Threading;

public class Mythread1 extends Thread{
   @Override
	public void run() {
		System.out.println("run start");
		System.out.println("in run #3: "+this.getState());
		try {
			Thread.sleep(5000);//Thread is blocked 
		} catch (InterruptedException e) {}
			System.out.println("run End");
		
		
		
   }
}

