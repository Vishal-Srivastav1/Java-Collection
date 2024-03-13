package com.nit.vk.Threading;

public class BankAccount {
   private long accNum;
   private String AccHName;
   private double balance;
   
   public BankAccount(long accNum,String AccHName,double balance) {
	     this.accNum=accNum;
	     this.AccHName=AccHName;
	     this.balance=balance;
	    		
   }
   public void deposit(double amt) {
	   this.balance = this.balance+amt;
   }
   public void withdraw(double amt) {
	   this.balance = this.balance-amt;
   }
   public void CurrentBalance() {
	   System.out.println(balance);
   }
   
   public String getAccHName() {
	   return AccHName;
   }
   
}
