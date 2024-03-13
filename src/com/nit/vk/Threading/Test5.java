package com.nit.vk.Threading;
/*Develop a Program to read and display main thread name and Priority also change the default name
 * and priority also change the default name and priority of the main thread and display the changed name and priority\*/

public class Test5 {
	public static void main(String[] args) {
		Thread th= Thread.currentThread();
		System.out.println("thread name: "+th.getName());
		System.out.println("Priority: "+th.getPriority());
		System.out.println();
		th.setName("vishal");
		th.setPriority(8);
		System.out.println("thread name: "+th.getName());
		System.out.println("Priority: "+th.getPriority());

}
}
