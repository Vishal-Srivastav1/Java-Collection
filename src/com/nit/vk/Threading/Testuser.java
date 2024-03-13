package com.nit.vk.Threading;

public class Testuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      Num20to1 nu1 = new Num20to1();
      nu1.start();
      
      for (int i=1; i<=20; i++)
      {
        System.out.println("main"+i);
      }
      
	}

}
