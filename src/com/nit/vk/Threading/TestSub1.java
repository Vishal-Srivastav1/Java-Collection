package com.nit.vk.Threading;

public class TestSub1 extends Thread{
		@Override
		public void run() {
			int sub=1;
			for (int i = 2; i < 20; i++) {
				sub-=i;
				System.out.println(getName()+" Subtraction  "+sub);
				
			}
		}

	}

