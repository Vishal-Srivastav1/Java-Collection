package com.nit.vk.ThreadingSynchronized;

public class Test1 extends Thread {
     private TestAddition a;
     
     public Test1 (TestAddition a) {
		 this.a=a; 
	}
     @Override
     public void run() {
    	 a.add(50, 60);
     }
}
