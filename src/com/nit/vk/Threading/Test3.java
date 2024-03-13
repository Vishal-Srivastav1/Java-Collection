package com.nit.vk.Threading;

public class Test3 extends Thread{
	@Override
	
		public void run() {
		for (int i = 1; i <=20; i++) {
			System.out.println(getId()+" "+getName()+" RUN: "+i);
		}	
		}
	

}
 