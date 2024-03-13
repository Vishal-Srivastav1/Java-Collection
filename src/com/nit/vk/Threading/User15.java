package com.nit.vk.Threading;

public class User15  extends Thread{
	
		   public void run() {
		      for(int i=1; i <= 3; i++) {
		         try {
		            Thread.sleep(1000);
		         } catch(Exception e) {
		            System.out.println(e);
		         }
		         System.out.println(getName()+" TutorialsPoint "+ i);
		      }
		   }
		   public static void main(String args[]) {
		      User15 t1 = new User15();
		      User15 t2 = new User15();
		      User15 t3 = new User15();
		      ;
		      t1.start();
		      try {
		         t1.join(); // calling join() method
		      } catch(Exception e) {
		         System.out.println(e);
		      }
		      t2.start();
		      t3.start();
		   }
		}

