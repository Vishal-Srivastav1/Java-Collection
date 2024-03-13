package com.nit.vk.Threading;

public class Test4 {
	static void m1() {
		Thread th = Thread.currentThread();
		System.out.println("M1 is Executed in the thread "+th.getName());
	}

}
