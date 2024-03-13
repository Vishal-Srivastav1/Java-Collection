package com.nit.vk.Threading;

//Develop a Multithread Program to display number 1-20 and 1-10 in two diff Custom thread Concurrently

public class Test1 extends Thread{
    private int x;
    
    public Test1(int x) {
    	this.x=x;
    }
    @Override
    public void run() {
		 for(int i=1;i<=x;i++) {
			 System.out.println(getName()+"run: "+i);
		 }
		
	}

		
	}


