package com.nit.vk.Threading;

public class UserTestBankThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bank Start");
		System.out.println("===================================================================");
		BankAccount acc1 =new BankAccount(1234, "vishal", 10000);
		BankAccount acc2 =new BankAccount(1222, "Shailash", 30000);
		BankAccount acc3 =new BankAccount(1344, "Rakesh", 50000);
		BankAccount acc4 =new BankAccount(1456, "Arun", 40000);
		System.out.println();
		System.out.print("acc1 Vishal balance is \t\t "); acc1.CurrentBalance();
		System.out.print("acc2 Shailash balance is \t"); acc2.CurrentBalance();
		System.out.print("acc3 Rakesh balance is \t\t"); acc3.CurrentBalance();
		System.out.print("acc4 Arun balance is \t\t"); acc4.CurrentBalance();
		
		
		
		DepositeThread dt1= new DepositeThread(acc1, 4000);
		DepositeThread dt2= new DepositeThread(acc2, 8000);
		DepositeThread dt3= new DepositeThread(acc3, 12000);
		DepositeThread dt4= new DepositeThread(acc4, 9000);
		
		System.out.println();
		System.out.println();
		
		WithdrawThread wt1 = new WithdrawThread(acc1, 3000);
		WithdrawThread wt2 = new WithdrawThread(acc2, 4000);
		WithdrawThread wt3 = new WithdrawThread(acc3, 5000);
		WithdrawThread wt4 = new WithdrawThread(acc4, 4000);
		
		dt1.start();
		dt2.start();
		dt3.start();
		dt4.start();
		System.out.println();
		wt1.start();
		wt2.start();
		wt3.start();
		wt4.start();
		
		try{Thread.sleep(1000);}
		catch(InterruptedException e) {}
		System.out.println();
		System.out.println();
		
		System.out.print("acc1 Vishal balance is \t\t "); acc1.CurrentBalance();
		System.out.print("acc2 Shailash balance is \t"); acc2.CurrentBalance();
		System.out.print("acc3 Rakesh balance is \t\t"); acc3.CurrentBalance();
		System.out.print("acc4 Arun balance is \t\t"); acc4.CurrentBalance();
		
		
		
		System.out.println("===================================================================");
		System.out.println("Bank End");
	}

}
