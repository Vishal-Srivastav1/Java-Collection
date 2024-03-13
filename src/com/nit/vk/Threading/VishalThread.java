package com.nit.vk.Threading;
//Devlop a program to read and display main thread name and priarity also change  the 
//default name and priority of main thread and display the changed name and Priority
public class VishalThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread th= Thread.currentThread();
       
	System.out.println("Thread Name is: "+th.getName()+"  ,Priority is: "+th.getPriority());
	 System.out.println();
	 
     th.setName("Vishal");
      th.setPriority(7);
      
      System.out.println("Thread Name is: "+th.getName()+"  ,Priority is: "+th.getPriority());
  	
	}

	
}
