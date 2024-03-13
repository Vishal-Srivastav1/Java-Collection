package com.nit.collection;

import java.util.ArrayList;


/*when we need to compare to String then we have CompareTo method like
 *         TreeSet<Student> tr1=new TreeSet<>((st1,st2) -> st2.compareTo(st1) );
 * 
 * 
 *                                   For ArrayList 
 *                                 "  object must be compratable -> Homogenious  like   "
 *                                   ArrayList<String> aList=new ArrayList<>();
 *                                   ArrayList<Integer> aList=new ArrayList<>();
 *                                 --  1.2  --
 *                                   // it is avalable in deffrent class 
 *                                   1. for Ascending we have method called  "Collections.sort(al1);"
 *                                   2. for descending we  have lamda Expression like Collections.sort(al1,(stt1,stt2)-> stt2.compareTo(stt1)
 *                                 --  1.8  --
 *                                   // it available in sem class
 *                                   1. alist.sort(null)// 
 *                                   2. aList.sort((i1,i2)-> i2.compareTo(i1)); coustom Compareter
 *                                   */

public class ArrayList1 {
         
//	 public boolean remove(Object obj) {
//		 int index =
//	 }
//

	public static void main(String[] args) {
		
	ArrayList<Object> aList=new ArrayList<>();
	System.out.println(aList.size());
	//System.out.println(aList.Capacity());// array don't have capacity method 
	//aList.ensureCapacity(10);
	System.out.println(aList);
	aList.add("a");
	aList.add(1);//0
	aList.add(2);//1
	aList.add(3);//2
	aList.add(4);//3
	aList.add(5);//4
	aList.add(null);
	aList.add("a");
	
	aList.add(6);//5 its remove by using index
	aList.add(7);//6
	aList.add(8);//7
	aList.add(9);//8
	aList.add(null);
	aList.add('a');
	aList.add("strtrtr");
	//Ex ex= new Ex(5, 6);
	aList.add(new Ex(6,7));
	aList.add(new Ex(8,9));
	aList.add(null);
	aList.add("a");
	aList.add(null);
	
	System.out.println(aList);
	
	System.out.println(aList);
//	System.out.println(aList.indexOf(5));
//	System.out.println(aList.contains(3));
//	aList.set(4, "raja");
//	System.out.println(aList);
//	aList.remove(5);
//	System.out.println(aList);
//	aList.remove((Integer)7);// using f3 we can see predifine .class file source code like "ArrayList1.class"                
//	System.out.println(aList);
//	System.out.println(aList);
//	aList.remove(2);
//	System.out.println(aList);
//	aList.remove((Character)'a');
//	//System.out.println(aList.toString());
//	boolean b=aList.contains(new Ex(6, 7));
//		boolean b11=aList.contains(new Ex(8, 9));
//		
//		System.out.println();
//		System.out.println(b+" "+b11);
//		
////		Object bObject=aList.get(3);
////		System.out.println(bObject);
//		
//		
		for (int i = 0; i <=aList.size()-1; i++) {
			Object bObject=aList.get(i);
			System.out.println(i+" ->"+bObject);
		}
		
//		
//	System.out.println();
//	int insex=aList.indexOf("strtrtr");
//    String st=(String)aList.get(insex);//dynamically
//   	System.out.println("st refrence for get "+st.toUpperCase());//Object Converted in UpperCase
//    aList.set(9, st.toUpperCase());
//    
//   	System.out.println(aList);
//    Object	b1=aList.contains("STRTRTR");//returving Object into UpperCase in collection
//   	//System.out.println();
//   	System.out.println(b1);
//   	
   	System.out.println();
   	System.out.println();
	//Object null1=aList.indexOf(null);
   	System.out.println();
    System.out.println("Multiple null");
	   for (int i = 0; i <aList.size(); i++) {   /// here we checking the how much null we have 
       Object index=aList.get(i);
        
		 // System.out.println("HELLO");
         if (index == null) {
        	 System.out.println(i+"-> "+index+"<- is  null");
		}
		}
	   System.out.println();
	   System.out.println("Multiple String");
	   for (int i = 0; i <aList.size(); i++) {   /// here we checking the multiple String how much string we have 
	      Object index=aList.get(i);
	      
			 if (index instanceof String) {
				 System.out.println(i+"-> "+index+"<- is String");
				
			}
			}
	   System.out.println();
	    System.out.println("Multiple char");
	   for (int i = 0; i <aList.size(); i++) {   /// here we checking the multiple char how much char we have 
	       Object index=aList.get(i);
	       
			 // System.out.println("HELLO");
	     if (index instanceof Character) {
			 System.out.println(i+"-> "+index+"<- is char");
		}
			}
	   
	   System.out.println();
	   System.out.println();
	   int index= aList.indexOf(new Ex(6, 7));
	   Ex e1=(Ex)aList.get(index);
	   System.out.println(e1);
	   System.out.println();
	   Ex e= new Ex(6, 7);
	   System.out.println(e);
	   e1=(Ex)aList.get(aList.indexOf(e));
	   System.out.println(e1);
	   e1.setX(e1.getX()+10);
	   e1.setY(e1.getY()+10);
	   System.out.println(e+" "+e1);
	   System.out.println(aList);
	   
	   System.out.println();
	  aList.add(new Ex(10, 17));
	  
	  int in= aList.indexOf(new Ex(10, 17));
	   System.out.println(in);
	   Ex e11=(Ex)aList.get(in);
	    Ex e2 = new Ex(10, 17);
	   System.out.println(e2);
	   e11.setX(e11.getX()+10);
	   e11.setY(e11.getY()+10);
	   System.out.println(e2+"\t"+e11);
	   System.out.println(aList);
	   System.out.println();
	   System.out.println();
	   aList.removeIf(ele -> ele instanceof String );// using lamda expression  we are removing all string available in the collection       
	   System.out.println(aList);
	   System.out.println();
	   aList.removeIf(ele -> (ele instanceof Ex) &&  ((Ex)ele).getX()==8);// removing the obj according to the "ref_veriable_value"
	   System.out.println(aList);
	   System.out.println();
	   aList.removeIf(ele -> (ele instanceof Integer) || ele ==null || ele instanceof Ex);// using lamda expression  we are removing all "Integer","Ex","null" available in the collection 
	   System.out.println(aList);
	   
	   
	   
	   
	   
	   
	   
		
	}
	  
	}
	
	
	//}
	
	


