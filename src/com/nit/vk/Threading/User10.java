package com.nit.vk.Threading;

public class User10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.out.println("Main start ");
       
        Test10 t1=new Test10();
        t1.start();
        Thread.sleep(1000);  // in the place of we should pass sleep() methods
        System.out.println("main end ");
	}

}
