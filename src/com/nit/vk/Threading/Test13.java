package com.nit.vk.Threading;



public class Test13 extends Thread{
    @Override
    public void run() {
    	System.out.println(getName()+" Run Start");
    	try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(getName()+" IE raised");
		}
    	System.out.println(getName()+" Run End ");
    }
}
