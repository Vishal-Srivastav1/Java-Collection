package com.nit.vk.ThreadingSynchronized;


 public class Test2 extends Thread {
	     private TestAddition a;
	     
	     public Test2(TestAddition a) {
			 this.a=a;
			 
		}
	     @Override
	     public void run() {
	    	 a.add(70, 80);
	     }
	}

