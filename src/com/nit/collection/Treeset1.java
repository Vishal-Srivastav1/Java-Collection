package com.nit.collection;

import java.util.TreeSet;


public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     treeset1 ts= new treeset1();
//      System.out.println(ts);
//      long L =50;
//      int i= 'a';
//      byte b2 = 127;
//      Integer io = 6;
//      Long lo = 50l;
//      System.out.println("long"+L);
//      System.out.println("int"+i);
//      System.out.println("byte"+b2);
//      System.out.println("Integer"+io);
//      System.out.println("Long"+lo);
		
		
      TreeSet<Object> ts1= new TreeSet<>(); // in treeset we can store only homoginus object if we try to store 
                                            // hetroginous we will get class cast exception
      System.out.println(ts1);
	       ts1.add("a");
	       ts1.add("f");
	       ts1.add("b");
	        ts1.add("g");
	        ts1.add("c");
	        ts1.add("h");
	        ts1.add("d");
	        ts1.add("i");
	        ts1.add("e");
	        //System.out.println();
        System.out.println(ts1);
        System.out.println();
        System.out.println();
        
        TreeSet<String> ts2=new TreeSet<>((s1,s2)-> (s2.compareTo(s1)));
        //System.out.println(st1.size());
        ts2.add("a");
        ts2.add("f");
        ts2.add("b");
        ts2.add("g");
        ts2.add("c");
        ts2.add("h");
        ts2.add("d");
        ts2.add("i");
        ts2.add("e");
        //System.out.println();
        System.out.println(ts2);
        System.out.println();
        
        TreeSet<Integer> ts3= new TreeSet<>((s11,s22)-> s22.compareTo(s11));
        ts3.add(1);
        ts3.add(2);
        ts3.add(3);
        ts3.add(4);
        ts3.add(5);
        ts3.add(6);
        ts3.add(7);
        ts3.add(8);
         
        for (int integer : ts3) {
			System.out.println(integer);
		}
        System.out.println();
        System.out.println();
        
           ts3.forEach(ValueExp -> System.out.print(ValueExp+" "));
           System.out.println();
           // lamda more sorter ways....
          ts3.forEach(System.out::print);// method refrences
          System.out.println();
          System.out.println();
          
        int min1=  ts3.stream().min((t1,t2)-> t1-(t2)).get();//here we getting min value...
          System.out.println(min1);
          System.out.println();
          
          int max1=  ts3.stream().max((t1,t2)-> t1-(t2)).get();//here we getting min value...
          System.out.println(max1);
          
        //  ts3.stream().filter()
          
          
          
          
          
          
          
		}
	
	
      
	}


