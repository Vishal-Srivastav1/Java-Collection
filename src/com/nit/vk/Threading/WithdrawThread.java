package com.nit.vk.Threading;

public class WithdrawThread extends Thread {
    private BankAccount acc;
    private double amt;
    
   public WithdrawThread(BankAccount acc,double amt) {
   	this.acc=acc;
   	this.amt=amt;
   }
   
   @Override
   public void run() {
   	acc.withdraw(amt);
   	System.out.println(getName()+" withdraw"+amt+" From the Account "+acc.getAccHName());
   	

  }
}