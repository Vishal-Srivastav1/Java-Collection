package com.nit.vk.Threading;

public class User13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread= Thread.currentThread();
		System.out.println(thread.getName()+"  Main start");
        Test13 t1 = new Test13();
        
        t1.interrupt(); 
        t1.start();
        t1.join();   //-- waiting
       t1.join(3000); //-- waiting
       Thread.sleep(100);  //-- waiting
        System.out.println(thread.getName()+"  Main end");
       
	}

}
            // Output
			//Main start
			//Main end
			//Run Start
			// IE raised
			//Run End 
