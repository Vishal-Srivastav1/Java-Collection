package com.nit.vk.Threading;

public class User2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
       Test2 ts= new Test2();
       System.out.println("In main #1: "+ts.getState());
       ts.start();
       System.out.println("In main#2: "+ts.getState());
       System.out.println("main End1 ");
       try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println("In main #4: "+ts.getState());
     System.out.println("Main End ");
    
	}

	

}
