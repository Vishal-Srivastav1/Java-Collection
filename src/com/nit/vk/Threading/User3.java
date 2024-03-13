package com.nit.vk.Threading;

public class User3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.println("Main Start");
			Test3 t3 =new Test3();
			Test3 t4 =new Test3();
			
			System.out.println(t3.getName()+" --> "+t3.getPriority());
			System.out.println(t4.getName()+" --> "+t4.getPriority());
			System.out.println();
			
			t3.setPriority(9);
			t4.setPriority(7);
			System.out.println(t3.getName()+" --> "+t3.getPriority());
			System.out.println(t4.getName()+" --> "+t4.getPriority());
			System.out.println();
 
 
			t4.setName("vishal");
			t3.setName("vishal");
			t3.getState();
			System.out.println(t3.getName()+" "+t3.getId()+" --> "+t3.getPriority());
			System.out.println(t4.getName()+" "+t4.getId()+" --> "+t4.getPriority());
			System.out.println();	
		    t3.start();
			//Thread.sleep(1000);
			t4.start();
			//t3.setPriority(15);  //java.lang.IllegalArgumentException
			//t4.setPriority(7); //java.lang.IllegalArgumentException
	
	}

}
