package com.nit.vk.Threading;
// Develop a program to display 1-20 number we must above see each number Printing



public class Test11 {
      static void Print() {
    	  for(int i=1; i<=20; i++) {
    		  
    		  System.out.println(i+" ");
  		  try {
    			  Thread.sleep(1000); // pauses CURRENT RUNNING THREAD MAY BE MAIN OR cOUSTOM THREAD
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	  }
      }
}
