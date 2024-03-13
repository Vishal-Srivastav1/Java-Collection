package com.nit.vk.Threading;
// Develop a Multhreading Program to perform two diff task..
// 1. adding numbers from 1-20
// 2. Subtracting number from 1-20	
//Display the result of each two number adding and Subtracting in each iteration 
public class TestAdd1 extends Thread{
	@Override
	public void run() {
		int sum=1;
		for (int i = 2; i < 20; i++) {
			sum+=i;
			System.out.println(getName()+" Summation  "+sum);
			
		}
	}

}
