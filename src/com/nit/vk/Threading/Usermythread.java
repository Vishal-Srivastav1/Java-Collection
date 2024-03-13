package com.nit.vk.Threading;

public class Usermythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Start");
      Mythread1 mt = new Mythread1();//thread object is Created
      System.out.println("In main #1: "+mt.getState());
      
		mt.start();	
		System.out.println("In main #2: "+mt.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		 System.out.println("In main #4: "+mt.getState());
		
		 try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {}
		 System.out.println("In main #5: "+mt.getState());
		System.out.println("Main End");
	}

}

//Output
//Main Start
//In main #1: NEW
//In main #2: RUNNABLE
//run start
//in run #3: RUNNABLE
//In main #4: TIMED_WAITING
//run End
//In main #5: TERMINATED
//Main End