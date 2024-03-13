package com.nit.vk.Threading;

public class DepositeThread extends Thread {
     private BankAccount acc;
     private double amt;
     
    public DepositeThread(BankAccount acc,double amt) {
    	this.acc=acc;
    	this.amt=amt;
    }
    
    @Override
    public void run() {
    	acc.deposit(amt);
    	System.out.println(getName()+" Deposite"+amt+" in the Account "+acc.getAccHName());
    }
     
}
