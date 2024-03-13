package com.nit.vk.Threading;

public class Test6 {
 
public static void main(String[] nj) {
	Thread thread1 =new Thread();
	System.out.println(thread1);
	System.out.println();
	
	Thread thread2 =new Thread();
	System.out.println(thread2);
	System.out.println();
	
	Thread thread3 =Thread.currentThread();
	System.out.println(thread3);
	//System.out.println();
	
	thread3.setPriority(7);
	
	System.out.println();
	Thread thread4 =new Thread();
	System.out.println(thread4);
	
	
}

}
