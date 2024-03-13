package com.nit.vk.Threading;

public class User9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main start ");
       
        Test9 t1=new Test9();
        t1.start();
        t1.yield();
        System.out.println("main end ");
	}

}
