package com.nit.vk.Threading;

public class User2Add_Sub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      TestAdd1 t1 = new TestAdd1();
      TestSub1 t2 = new TestSub1();
      t1.start();
     Thread.sleep(1);
      t2.start();
	}

}
