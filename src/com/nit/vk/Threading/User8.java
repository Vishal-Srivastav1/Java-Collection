package com.nit.vk.Threading;
///  --> Pass reference as a Thread name
public class User8 {

	public static void main(String[] args) {
		System.out.println("Main start");
		// TODO Auto-generated method stub
//       Test8 t1=new Test8("t1");
//       t1.start();            //t1 is started as non-daemon
       
       
       Test8 t1=new Test8("t1");
       t1.setDaemon(true); 
       t1.start();             //t1 is started as  daemon
       t1.setDaemon(true);
     System.out.println("Main End");
       
       
       
       
	}

}
