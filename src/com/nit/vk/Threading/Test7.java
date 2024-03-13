package com.nit.vk.Threading;
import vishal.ConsoleColors;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ThreadGroup group1= new ThreadGroup("Group-1");
          ThreadGroup group2= new ThreadGroup("Group-2");
          
          System.out.println(ConsoleColors.TEXT_BACKGROUND);
          Thread th1 =new Thread(group1,"child1");
          Thread th2 =new Thread(group1,"child2");
          Thread th3 =new Thread(group2,"child3");
          Thread th4 =new Thread(group2, "child4");
          Thread th5 =new Thread("child5");
          
          System.out.println(th1.getName()+" belong to "+th1.getThreadGroup().getName()+" group");
          System.out.println();
          System.out.println(th2.getName()+" belong to "+th2.getThreadGroup().getName()+" group");
          System.out.println();
          System.out.println(th3.getName()+" belong to "+th3.getThreadGroup().getName()+" group");
          System.out.println();
          System.out.println(th4.getName()+" belong to "+th4.getThreadGroup().getName()+" group");
          System.out.println();
          System.out.println(th5.getName()+" belong to "+th5.getThreadGroup().getName()+" group");
	}

}
