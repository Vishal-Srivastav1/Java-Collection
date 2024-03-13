package com.nit.vk.ThreadingSynchronized;
//   Synchronized are executing Sequencely
  //  Using synchronized keywords we will get true and secure values
public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestAddition a11=new TestAddition();
      Test1 test1 =new Test1(a11);
      Test2 test2 =new Test2(a11);
      
      test1.start();
      test2.start();
	}

}
